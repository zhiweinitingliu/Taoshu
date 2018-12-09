package com.dukang.tushunet.common.utils

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.dukang.tushunet.base.BookApplication

/**
 * @Description :shareprefrences工具类
 * @Author : wdk
 * @CretaTime : 2018/12/9 15:29
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/9 15:29
 * @LastCheckBy :wdk
 */
class SharePreferencesUtil {

    companion object {
        private var sharedPreferences: SharedPreferences = BookApplication.getContext()!!.getSharedPreferences("book_", MODE_PRIVATE)

        //-----------------------------获取数据-----------------------------------
        /**
         * 获取String 数据
         */
        fun getStringValue(key: String): String {
            return sharedPreferences.getString(key, "")
        }


        //------------------------------存储数据----------------------------------
        fun putStringValue(key: String, value: String) {
            val edit = sharedPreferences.edit()
            edit.putString(key, value).commit()
        }

    }


}