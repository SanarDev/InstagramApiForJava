package com.sanardev.instagramapijavatest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sanardev.instagramapijava.IGConstants
import com.sanardev.instagramapijava.InstaClient
import kotlinx.android.synthetic.main.activity_two_auth.*

class TwoStepAuthActivity : AppCompatActivity() {

    private lateinit var instaClient: InstaClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_auth)

        val extras = intent.extras!!
        val username = extras.getString("username")!!
        val password = extras.getString("password")!!

        instaClient = InstaClient(applicationContext,username,password)
        btn_check.setOnClickListener {
            instaClient.accountProcessor.twoStepAuth(edt_passcode.text.toString())
                .subscribe({
                    if(it.status == IGConstants.STATUS_FAIL){
                        if(it.errorType == IGConstants.Errors.LOGIN_INVALID_SMS_CODE){

                        }
                    }
            },{
                    // Handle error
            },{
                    // onComplete
            })
        }
    }
}