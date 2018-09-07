package com.zhh.wanandroid.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * 页面基类
 */
abstract class BaseActivity : AppCompatActivity() {

    /**
     * 布局文件
     */
    protected abstract fun getLayoutRes(): Int


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutRes())
    }

}