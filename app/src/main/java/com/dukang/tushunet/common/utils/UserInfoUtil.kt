package com.dukang.tushunet.common.utils

/**
 * @Description :用户信息的util
 * @Author : wdk
 * @CretaTime : 2018/12/10 10:22
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/10 10:22
 * @LastCheckBy :wdk
 */
object UserInfoUtil {

    fun saveUserToken(token: String) {
        SharePreferencesUtil.putStringValue("ts_token", token)
    }

    fun getUserToken(): String {
        return SharePreferencesUtil.getStringValue("ts_token")
    }

}