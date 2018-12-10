package com.dukang.tushunet.common.utils.json

import android.text.TextUtils
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.parser.Feature
import com.google.gson.Gson
import org.json.JSONObject
import java.lang.reflect.Type

/**
 * @Description :
 * @Author : wdk
 * @CretaTime : 2018/12/9 16:24
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/9 16:24
 * @LastCheckBy :wdk
 */
object JsonUtil {

    fun getRootJSONObject(json: String): JSONObject {
        var jsonObject = JSONObject(json)
        return jsonObject
    }

    fun getStringValue(jsonObject: JSONObject, key: String): String {
        return jsonObject.optString(key, "")
    }

    fun getIntValue(jsonObject: JSONObject, key: String): Int {
        return jsonObject.optInt(key, -1)
    }


    //-----------------------fastJson解析------------------------------

    //fastjson 解析时异常处理
    private val features = arrayOf(Feature.InitStringFieldAsEmpty, Feature.CustomMapDeserializer, Feature.UseObjectArray)

    /**
     * 将json转换为bean 对象
     *
     * @param json json
     * @param type 转换的类型 obj 还是list
     * @param <T>  泛型 model
     * @return 结果
    </T> */
    fun <T> fastJsonToBean(json: String, type: Type): T? {
        return if (!TextUtils.isEmpty(json) && json.startsWith("{")) {
            try {
                JSON.parseObject<T>(json, type, *features)
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }

        } else {
            null
        }

    }

    /**
     * 将json转换为数组
     *
     * @param json   json
     * @param mClass 转换类型的类名
     * @param <T>    泛型 model
     * @return 结果
    </T> */
    fun <T> fastJsonToArray(json: String, mClass: Class<T>): List<T>? {
        return if (!TextUtils.isEmpty(json) && json.startsWith("[")) {
            try {
                JSON.parseArray(json, mClass)
            } catch (e: Exception) {
                null
            }

        } else {
            null
        }
    }

    //-----------------------------------Gson 解析--------------------------------

    fun <T> gsonToBean(json: String, type: Type): T? {
        return Gson().fromJson(json, type)
    }
}