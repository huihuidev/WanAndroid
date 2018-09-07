package com.zhh.wanandroid.ui.activity

import android.content.Intent
import android.os.Bundle
import com.bumptech.glide.Glide
import com.zhh.wanandroid.R
import com.zhh.wanandroid.app.MainActivity
import com.zhh.wanandroid.base.BaseActivity
import com.zhh.wanandroid.utils.logD
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * 启动页
 */
class SplashActivity : BaseActivity() {

    override fun getLayoutRes(): Int = R.layout.activity_splash;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var url = "http://suo.im/4DDpNp"
        Glide.with(this).load(url).into(imageView);
        imageView.setOnClickListener {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }

        logD("启动页")
    }
}