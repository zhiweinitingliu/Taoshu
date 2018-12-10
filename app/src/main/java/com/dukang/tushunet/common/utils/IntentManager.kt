package com.dukang.tushunet.common.utils

import android.app.Activity
import android.content.Context
import android.content.Intent

/**
 * @Description :activity 跳转管理类
 * @Author : wdk
 * @CretaTime : 2018/12/10 11:02
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/10 11:02
 * @LastCheckBy :wdk
 */
object IntentManager {

    /**
     * @param context 上下文
     * @param classes 目标class
     */
    fun startActivity(context: Context, clazz: Class<out Activity>) {
        var intent = Intent(context, clazz)
        context.startActivity(intent)
    }
}