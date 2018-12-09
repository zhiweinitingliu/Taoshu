package com.dukang.tushunet.common.utils

import org.json.JSONObject

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

}