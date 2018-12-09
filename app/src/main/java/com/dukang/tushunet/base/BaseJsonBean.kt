package com.dukang.tushunet.base

/**
 * @Description :root json bean
 * @Author : wdk
 * @CretaTime : 2018/12/9 16:12
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/9 16:12
 * @LastCheckBy :wdk
 */
data class BaseJsonBean(
        var code: Int,
        var data: String,
        var message: String
)