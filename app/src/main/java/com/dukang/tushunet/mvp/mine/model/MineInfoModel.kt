package com.dukang.tushunet.mvp.mine.model

import com.dukang.tushunet.common.net.BuildFactory
import com.dukang.tushunet.common.net.RetrofitCallBackListener
import com.dukang.tushunet.common.net.RetrofitRequest
import com.dukang.tushunet.common.utils.UserInfoUtil
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

/**
 * @Description :我的页面
 * @Author : wdk
 * @CretaTime : 2018/12/10 14:49
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/10 14:49
 * @LastCheckBy :wdk
 */
class MineInfoModel {

    fun getUserInfo(retrofitCallBackListener: RetrofitCallBackListener<MineInfoBean>) {
        val mineInfoApi = BuildFactory.create(MineInfoApi::class.java)
        val call = mineInfoApi.getUserInfo(UserInfoUtil.getUserToken())
        RetrofitRequest<MineInfoBean>(call, retrofitCallBackListener).request()
    }


    interface MineInfoApi {

        @GET("get_user_info")
        fun getUserInfo(@Header("token") token: String): Call<JsonObject>

    }
}