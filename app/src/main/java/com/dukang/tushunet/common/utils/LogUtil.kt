package com.dukang.tushunet.common.utils

import android.text.TextUtils
import android.util.Log
import com.dukang.tushunet.BuildConfig

/**
 * @Description :
 * @Author : wdk
 * @CretaTime : 2018/12/9 15:20
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/9 15:20
 * @LastCheckBy :wdk
 */
class LogUtil {


    companion object {

        fun e(tag: String, msg: String) {
            if (BuildConfig.DEBUG) {
                var printTag = "tag"
                var printMsg = ""
                if (!TextUtils.isEmpty(tag)) {
                    printTag = tag
                }
                if (!TextUtils.isEmpty(msg)) {
                    printMsg = msg
                }
                Log.e(printTag, printMsg)
            }
        }
    }


}