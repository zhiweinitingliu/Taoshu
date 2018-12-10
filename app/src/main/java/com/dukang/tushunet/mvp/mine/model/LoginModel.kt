package com.dukang.tushunet.mvp.mine.model

import com.dukang.tushunet.common.net.BuildFactory
import com.dukang.tushunet.common.net.RetrofitCallBackListener
import com.dukang.tushunet.common.net.RetrofitRequest
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


/**
 * @Description :
 * @Author : wdk
 * @CretaTime : 2018/12/8 15:17
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/8 15:17
 * @LastCheckBy :wdk
 */
class LoginModel {

    /**
     *用户登录
     */
    fun login(userName: String, password: String,retrofitCallBackListener: RetrofitCallBackListener<LoginBean>) {
        val loginApi = BuildFactory.create(LoginApi::class.java)
        val call = loginApi.doLogin(userName, password)
        RetrofitRequest<LoginBean>(call,retrofitCallBackListener).request()

    }

    interface LoginApi {

        @FormUrlEncoded
        @POST("login_act")
        fun doLogin(@Field("user_name") user_name: String, @Field("password") password: String): Call<JsonObject>

    }
}
