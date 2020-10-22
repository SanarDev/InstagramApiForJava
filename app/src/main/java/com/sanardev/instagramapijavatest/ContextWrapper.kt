package com.sanardev.instagramapijavatest

import android.annotation.SuppressLint
import android.app.ActivityManager
import android.content.Context
import android.content.ContextWrapper
import android.net.ConnectivityManager
import androidx.core.content.ContextCompat
import java.io.File
import java.io.InputStream

@SuppressLint("MissingPermission")
fun ContextWrapper.isNetworkConnected(): Boolean {
    val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val connection = cm.activeNetworkInfo
    return connection != null && connection.isConnectedOrConnecting
}
fun Context.color(color:Int):Int{
    return ContextCompat.getColor(this,color)
}


@Suppress("DEPRECATION") // Deprecated for third party Services.
fun <T> Context.isServiceRunning(service: Class<T>) =
    (getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager)
        .getRunningServices(Integer.MAX_VALUE)
        .any { it.service.className == service.name }

fun InputStream.toFile(path: String) {
    use { input ->
        File(path).outputStream().use { input.copyTo(it) }
    }
}