package com.dukang.tushunet.common.utils.json

import android.widget.Toast
import com.dukang.tushunet.base.BookApplication

/**
 * @Description :
 * @Author : wdk
 * @CretaTime : 2018/12/10 10:59
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/10 10:59
 * @LastCheckBy :wdk
 */
object ToastUtil {

    fun toast(msg: String) {
        Toast.makeText(BookApplication.getContext(), msg, Toast.LENGTH_SHORT).show()
    }

}