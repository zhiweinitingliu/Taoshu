package com.dukang.tushunet.mvp.mine.view

import com.dukang.tushunet.mvp.mine.model.MineInfoBean

/**
 * @Description :
 * @Author : wdk
 * @CretaTime : 2018/12/10 16:12
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/10 16:12
 * @LastCheckBy :wdk
 */
interface IMineView {

    fun callBackUserInfo(mineInfoBean: MineInfoBean)
}