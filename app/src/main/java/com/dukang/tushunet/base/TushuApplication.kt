package com.dukang.tushunet.base

import android.app.Application

/**
 * @Description :
 * @Author : wdk
 * @CretaTime : 2018/12/9 15:32
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/9 15:32
 * @LastCheckBy :wdk
 */
class BookApplication : Application() {

    companion object {
        private var application: BookApplication? = null

        fun getContext(): BookApplication? {
            return application
        }
    }

    override fun onCreate() {
        super.onCreate()
        init()
    }

    private fun init() {
        application = this
    }

}