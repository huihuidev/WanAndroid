package com.zhh.wanandroid.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zhh.wanandroid.R
import com.zhh.wanandroid.utils.showToast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 主页
 */
class MainActivity : AppCompatActivity() {
    var lastTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "主页"
    }

    override fun onBackPressed() {
        val currentTimeMillis = System.currentTimeMillis()
        if (currentTimeMillis - lastTime <= 2000) {
            super.onBackPressed()
        } else {
            lastTime = currentTimeMillis
            showToast("再按一次退出应用")
        }
    }
}
