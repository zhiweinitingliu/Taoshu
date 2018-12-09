package com.dukang.tushunet.mvp.login.presenter

import com.dukang.tushunet.common.net.RetrofitCallBackListener
import com.dukang.tushunet.common.utils.LogUtil
import com.dukang.tushunet.mvp.login.model.LoginBean
import com.dukang.tushunet.mvp.login.model.LoginModel
import com.dukang.tushunet.mvp.login.view.ILoginView

/**
 * @Description:
 * @Author:  wdk
 * @CreatTime: 2018/11/13 14:44
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/13 14:44
 * @LastCheckedBy: wdk
 */
class LoginPresenterCompl(private var iLoginView: ILoginView?) : ILoginPresenter {

    override fun doLogin(userName: String, password: String) {
        LoginModel().login(userName, password, object : RetrofitCallBackListener<LoginBean> {
            override fun onSuccess(json: String) {
                LogUtil.e("loginModel:", json)
                iLoginView?.loginResult(json)
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