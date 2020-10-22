package com.sanardev.instagramapijava.network

import okhttp3.Headers
class Resource<T> private constructor(var status: Resource.Status, var data: T?, var headers: Headers?=null, val apiError:APIErrors<T>?) {
    enum class Status {
        SUCCESS, ERROR, LOADING
    }
    companion object {
        @JvmStatic
        fun <T> success(data: T?=null,headers: Headers?=null): Resource<T> {
            return Resource(Status.SUCCESS, data, headers,null)
        }
        @JvmStatic
        fun <T> error(apiError: APIErrors<T>?=null): Resource<T> {
            return Resource(Status.ERROR, null,null, apiError)
        }
        @JvmStatic
        fun <T> loading(data: T?=null): Resource<T> {
            return Resource(Status.LOADING, data, null,null)
        }
    }
}