package com.sanardev.instagramapijavatest

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.sanardev.instagramapijava.IGConstants
import com.sanardev.instagramapijava.InstaClient
import com.sanardev.instagramapijava.response.IGLoginResponse
import com.sanardev.instagramapijava.utils.InstaHashUtils
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var instaClient: InstaClient

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            instaClient =
                InstaClient(
                    applicationContext,
                    edt_username.text.toString(),
                    edt_password.text.toString()
                );
            instaClient.accountProcessor.login()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object:Observer<IGLoginResponse>{
                    override fun onComplete() {

                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(it: IGLoginResponse) {
                        if(it.status == IGConstants.STATUS_FAIL){
                            when(it.errorType){
                                IGConstants.Errors.LOGIN_BAD_PASSWORD ->{
                                    Toast.makeText(applicationContext,it.message,Toast.LENGTH_SHORT).show();
                                }
                                IGConstants.Errors.LOGIN_TOO_MANY_TRIED ->{
                                    Toast.makeText(applicationContext,it.message,Toast.LENGTH_SHORT).show();
                                }
                                IGConstants.Errors.LOGIN_REQUIRE_TWO_STEP_AUTH ->{
                                    startActivity(Intent(this@MainActivity,TwoStepAuthActivity::class.java).apply {
                                        putExtra("username",edt_username.text.toString())
                                        putExtra("password",edt_password.text.toString())
                                    })
                                    finish()
                                }
                            }
                        }else{
                            startActivity(Intent(this@MainActivity,HomeActivity::class.java))
                            finish()
                        }
                    }

                    override fun onError(e: Throwable) {

                    }
                })
        }
    }

}