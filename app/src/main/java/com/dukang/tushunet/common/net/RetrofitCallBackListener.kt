package com.dukang.tushunet.common.net

/**
 * @Description : retrofit 网络请求 回调listener
 * @Author : wdk
 * @CretaTime : 2018/12/8 11:05
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/8 11:05
 * @LastCheckBy :wdk
 */
interface RetrofitCallBackListener<T> {

    fun onSuccess(json: String)

    fun onFailed(code: Int, msg: String)

    fun onFinish()

    fun onThroable(t: Throwable)

}