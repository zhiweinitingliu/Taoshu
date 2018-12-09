package com.dukang.tushunet.common.net

/**
 * @Description :
 * @Author : wdk
 * @CretaTime : 2018/12/8 13:59
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/8 13:59
 * @LastCheckBy :wdk
 */
object BuildFactory {

    /**
     * 通过Retrofit  创建由{@code service}接口定义的API端点的实现。
     */
    fun <T> create(a: Class<T>): T {
        return HttpUtil.getBuilder().build().create(a) as T
    }
}