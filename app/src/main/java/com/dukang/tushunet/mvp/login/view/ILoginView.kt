package com.dukang.tushunet.mvp.login.view

/**
 * @Description:
 * @Author:  wdk
 * @CreatTime: 2018/11/13 15:00
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/13 15:00
 * @LastCheckedBy: wdk
 */
open interface ILoginView {
    fun doLogin(userName: String, password: String)

    fun loginResult(code:Int)
}