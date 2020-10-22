package com.sanardev.instagramapijava.network

import okhttp3.ResponseBody
import retrofit2.Response

data class APIErrors<T>(
    var code: Int,
    var message: String? = null,
    var data: ResponseBody? = null
) {

    companion object {
        const val INTERNET_CONNECTION = 101

        fun <T> parseError(response: Response<T>): APIErrors<T> {
            return APIErrors(response.code(), response.message(), data = response.errorBody())
        }
    }
}