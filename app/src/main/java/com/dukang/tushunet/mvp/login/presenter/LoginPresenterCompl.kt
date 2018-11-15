package com.dukang.tushunet.mvp.login.presenter

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

    var a: Int = 1
//    fun LoginPresenterCompl(iLoginView: ILoginView) {
//        this.iLoginView = iLoginView
//    }

    override fun doLogin(userName: String, password: String) {
        iLoginView?.loginResult(200)
    }

}