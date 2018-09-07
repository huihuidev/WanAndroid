package com.zhh.wanandroid.network

/**
 * page name:
 *
 * date: 2018/9/7
 *
 * author: HUIHUI
 *
 */
class HttpMethod {
    companion object {
        val httpMethod: HttpMethod = Holder.INSTANCE
    }

    private object Holder {
        val INSTANCE = HttpMethod()
    }
}