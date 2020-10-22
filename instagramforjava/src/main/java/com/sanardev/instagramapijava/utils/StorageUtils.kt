package com.sanardev.instagramapijava.utils

import android.content.Context
import com.google.gson.GsonBuilder
import com.sanardev.instagramapijava.app.Cookie
import com.sanardev.instagramapijava.model.login.IGLoggedUser
import com.sanardev.instagramapijava.model.login.IGTwoFactorInfo
import okhttp3.Headers
import java.io.*
import java.util.*

class StorageUtils {
    companion object {
        private const val USER_DATA = "userData"
        private const val COOKIE_DATA = "cookie"
        private const val TWO_FACTOR_INFO = "twoFactorInfo"

        @JvmStatic
        fun saveCookie(
            context: Context,
            cookie: Cookie,
            username: String
        ) {
            removeFiles(context, COOKIE_DATA)
            val gson = GsonBuilder().create()
            val json = gson.toJson(cookie)
            writeFile(
                context,
                username+"_"+COOKIE_DATA,
                json
            )
        }

        @JvmStatic
        fun getCookie(context: Context,username:String): Cookie {
            var cookie =
                readFile(
                    context,
                    username+"_"+COOKIE_DATA,
                    Cookie::class.java
                )
            if (cookie == null) {
                cookie = generateRandomCookie()
            }
            return cookie
        }

        private fun generateRandomCookie(): Cookie {
            val cookie =
                Cookie()
            cookie.adid = UUID.randomUUID().toString()
            cookie.guid = UUID.randomUUID().toString()
            cookie.phoneID = UUID.randomUUID().toString()
            cookie.sessionID = UUID.randomUUID().toString()
            return cookie
        }

        @JvmStatic
        fun removeFiles(context: Context,vararg filePaths:String){
            for(path in filePaths){
                File("${context.filesDir.path}/$path").delete()
            }
        }

        private fun writeFile(
            context: Context,
            fileName: String,
            data: String
        ) {
            val file =
                File(context.filesDir.toString() + File.separator + fileName)
            var fr: FileWriter? = null
            try {
                fr = FileWriter(file)
                fr.write(data)
            } catch (e: IOException) {
                e.printStackTrace()
            } finally {
                //close resources
                try {
                    fr!!.close()
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        }

        private fun <T> readFile(context: Context, filename: String, clazz: Class<T>): T? {
            val file = File("${context.filesDir.path}/$filename")
            if (!file.exists())
                return null
            val inputStream: InputStream = file.inputStream()
            val inputString: String = inputStream.bufferedReader().use { it.readText() }
            if (inputString.isBlank()) {
                return null
            }
            val gson = GsonBuilder().setLenient().create()
            val user = gson.fromJson(inputString, clazz)
            return user
        }

        @JvmStatic
        fun findParamFromCookie(headers: Headers, name: String): String? {
            val cookieList = headers.values("set-cookie")
            for (cookie in cookieList) {
                val params = cookie.split(";".toRegex()).toTypedArray()
                for (param in params) {
                    val keyValue =
                        param.split("=".toRegex()).toTypedArray()
                    if (keyValue.size == 2) {
                        val key = keyValue[0]
                        val value = keyValue[1]
                        if (key == name) {
                            return value
                        }
                    }
                }
            }
            return null
        }

        @JvmStatic
        fun saveUserData(context: Context,user: IGLoggedUser) {
            val gson = GsonBuilder().create()
            val json = gson.toJson(user)
            writeFile(
                context,
                user.username + "_" +USER_DATA,
                json
            )
        }
        @JvmStatic
        fun getUserData(context: Context,username: String): IGLoggedUser? {
            return readFile(context, username+"_"+USER_DATA,IGLoggedUser::class.java)
        }

        @JvmStatic
        fun clear(context: Context) {
            removeFiles(context, COOKIE_DATA);
            removeFiles(context, USER_DATA);
        }

        @JvmStatic
        fun saveTwoFactorInfo(context: Context, username: String, twoFactorInfo: IGTwoFactorInfo) {
            val fileName = username + "_"+TWO_FACTOR_INFO;
            removeFiles(context,fileName)
            val gson = GsonBuilder().create()
            val json = gson.toJson(twoFactorInfo)
            writeFile(context,fileName,json)
        }
        @JvmStatic
        fun getTwoFactorInfo(context: Context, username: String): IGTwoFactorInfo? {
            val fileName = username + "_"+TWO_FACTOR_INFO;
            return readFile(context,fileName,IGTwoFactorInfo::class.java)
        }
    }
}