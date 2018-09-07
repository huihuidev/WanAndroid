package com.zhh.wanandroid.utils

import android.content.Context
import android.support.v4.app.Fragment
import android.util.Log
import android.widget.Toast
import com.zhh.wanandroid.BuildConfig

/**
 * page name: 扩展
 *
 * date: 2018/9/7
 *
 * author: HUIHUI
 *
 */

fun Context.showToast(content: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, content, duration).show()
}

fun Fragment.showToast(content: String, duration: Int = Toast.LENGTH_SHORT) {
    this.activity?.let {
        Toast.makeText(this.activity?.applicationContext, content, duration).show()
    }
}

fun logD(msg: String?, tag: String = "wan-android") {
    if (BuildConfig.IS_DEBUG) Log.d(tag, msg ?: "empty Msg");
}