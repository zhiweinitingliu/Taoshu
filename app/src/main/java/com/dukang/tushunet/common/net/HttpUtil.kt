package com.dukang.tushunet.common.net

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @Description :
 * @Author : wdk
 * @CretaTime : 2018/12/8 13:50
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/8 13:50
 * @LastCheckBy :wdk
 */
object HttpUtil {

//   private val API_GANKIO = "http://192.168.10.82:8898/tushu/"
    private val API_GANKIO = "http://118.24.121.245:8080/tushu/"


    fun getBuilder(): Retrofit.Builder {
        val builder = Retrofit.Builder()
        builder.baseUrl(API_GANKIO)//设置远程地址
                .addConverterFactory(GsonConverterFactory.create())//这里一般传个GsonConverterFactory对象就可以用gson完成自动解析
        return builder
    }

}