package com.dukang.tushunet.mvp.mine.presenter

import com.dukang.tushunet.common.net.RetrofitCallBackListener
import com.dukang.tushunet.common.utils.LogUtil
import com.dukang.tushunet.common.utils.json.JsonUtil
import com.dukang.tushunet.mvp.mine.model.MineInfoBean
import com.dukang.tushunet.mvp.mine.model.MineInfoModel
import com.dukang.tushunet.mvp.mine.view.IMineView

/**
 * @Description :我的页面presenter
 * @Author : wdk
 * @CretaTime : 2018/12/10 14:44
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/10 14:44
 * @LastCheckBy :wdk
 */
class MineInfoPresenterImpl(private var iMineView: IMineView) : MineInfoPresenter {

    /**
     * 获取用户信息
     */
    override fun getMineInfo() {
        MineInfoModel().getUserInfo(object : RetrofitCallBackListener<MineInfoBean> {
            override fun onSuccess(json: String) {
                LogUtil.e("wode", json)
                iMineView.callBackUserInfo(JsonUtil.gsonToBean<MineInfoBean>(json,MineInfoBean::class.java)!!)
            }

            override fun onFailed(code: Int, msg: String) {

            }

            override fun onFinish() {

            }

            override fun onThroable(t: Throwable) {

            }

        })
    }

}