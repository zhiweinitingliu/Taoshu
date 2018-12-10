package com.dukang.tushunet.common.net

import com.dukang.tushunet.common.utils.LogUtil
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * @Description :发起retrofit网络请求
 * @Author : wdk
 * @CretaTime : 2018/12/9 17:15
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/9 17:15
 * @LastCheckBy :wdk
 */
class RetrofitRequest<T>(private var call: Call<JsonObject>, private var listener: RetrofitCallBackListener<T>) {

    fun request() {

        call.enqueue(object : Callback<JsonObject> {
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                if (response.isSuccessful) {
                    //网络请求成功
                    LogUtil.e("登录返回的信息:", response.body().toString())

                    var baseBean = ResponseBaseJsonIntercept.getBaseJsonBean(response.body().toString())

                    when (baseBean.code) {
                        200 -> {
                            //请求接口数据成功，并且操作成功

                            listener.onSuccess(baseBean.data)
                        }
                        400 -> {
                            //请求接口数据成功，操作失败
                        }
                        else -> {
                            //请求接口数据成功，但是没有获得指定的code，不知道该进行什么样的操作,按异常处理
                        }
                    }

                } else {
                    //失败
                    listener.onFailed(response.code(), response.errorBody().toString())
                }
                listener.onFinish()
            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {


                listener.onFinish()
                listener.onThroable(t)
            }

        })


    }

}