package com.dukang.tushunet.common.net

import android.text.TextUtils
import com.dukang.tushunet.base.BaseJsonBean
import com.dukang.tushunet.common.utils.JsonUtil
import org.json.JSONObject

/**
 * @Description :对请求回来的json进行拦截处理，返回一个标准的model
 * @Author : wdk
 * @CretaTime : 2018/12/9 16:10
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/9 16:10
 * @LastCheckBy :wdk
 */
object ResponseBaseJsonIntercept {

    fun getBaseJsonBean(json: String): BaseJsonBean {
        var code: Int
        var data = ""
        var message = "数据开小差了"
        var jsonObject = JsonUtil.getRootJSONObject(json)

        var parseCode = JsonUtil.getIntValue(jsonObject, "code")
        var parseData = JsonUtil.getStringValue(jsonObject, "data")
        var parseMessage = JsonUtil.getStringValue(jsonObject, "message")

        code = parseCode

        if (!TextUtils.isEmpty(parseData)) {
            data = parseData
        }

        if (!TextUtils.isEmpty(parseMessage)) {
            message = parseMessage
        }


        var baseJsonBean = BaseJsonBean(code, data, message)
        return baseJsonBean
    }

}