package com.dukang.tushunet.mvp.mine.presenter

import com.dukang.tushunet.common.net.RetrofitCallBackListener
import com.dukang.tushunet.common.utils.json.JsonUtil
import com.dukang.tushunet.common.utils.UserInfoUtil
import com.dukang.tushunet.mvp.mine.model.LoginBean
import com.dukang.tushunet.mvp.mine.model.LoginModel
import com.dukang.tushunet.mvp.mine.view.ILoginView

/**
 * @Description:
 * @Author:  wdk
 * @CreatTime: 2018/11/13 14:44
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/13 14:44
 * @LastCheckedBy: wdk
 */
class LoginPresenterImpl(private var iLoginView: ILoginView?) : ILoginPresenter {

    override fun doLogin(userName: String, password: String) {
        LoginModel().login(userName, password, object : RetrofitCallBackListener<LoginBean> {
            override fun onSuccess(json: String) {
                var loginBean = JsonUtil.gsonToBean<LoginBean>(json, LoginBean::class.java)
                UserInfoUtil.saveUserToken(loginBean?.token!!)
                iLoginView?.loginResult()
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