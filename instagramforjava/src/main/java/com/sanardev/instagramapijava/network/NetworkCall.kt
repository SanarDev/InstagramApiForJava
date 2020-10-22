package com.sanardev.instagramapijava.network

import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


open class NetworkCall<T>{
    lateinit var call:Call<T>

    fun makeCall(call:Call<T>): MutableLiveData<Resource<T>> {
        this.call = call
        val callBackKt =
            CallBackKt<T>()
        callBackKt.result.postValue(Resource.loading(null))
        this.call.clone().enqueue(callBackKt)
        return callBackKt.result
    }

    class CallBackKt<T>: Callback<T> {
        var result: MutableLiveData<Resource<T>> = MutableLiveData()

        override fun onFailure(call: Call<T>, t: Throwable) {
            result.value = Resource.error(APIErrors(APIErrors.INTERNET_CONNECTION,t.message))
            t.printStackTrace()
        }

        override fun onResponse(call: Call<T>, response: Response<T>) {
            if(response.isSuccessful) {
                result.value =
                    Resource.success(data = response.body(), headers = response.headers())
            }else{
                result.value = Resource.error(
                    APIErrors.parseError(response))
            }
        }
    }

    fun cancel(){
        if(::call.isInitialized){
            call.cancel()
        }
    }
}