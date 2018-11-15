package com.dukang.tushunet.mvp.login

import android.widget.Toast
import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseActivity
import com.dukang.tushunet.mvp.login.presenter.ILoginPresenter
import com.dukang.tushunet.mvp.login.presenter.LoginPresenterCompl
import com.dukang.tushunet.mvp.login.view.ILoginView

import kotlinx.android.synthetic.main.activity_login.*

/**
 * @Description:登录
 * @Author:  wdk
 * @CreatTime: 2018/11/13 14:14
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/13 14:14
 * @LastCheckedBy: wdk
 */
class LoginActivity : BaseActivity(R.layout.activity_login), ILoginView {

    lateinit var loginPresonel: ILoginPresenter

    override fun initView() {
        loginPresonel = LoginPresenterCompl(this)
    }

    override fun initListener() {
        btn_login.setOnClickListener {
            loginPresonel.doLogin("", "")

        }
    }

    override fun initData() {

    }

    override fun doLogin(userName: String, password: String) {

    }

    override fun loginResult(code: Int) {
        Toast.makeText(this,"登录成功",Toast.LENGTH_LONG).show()
    }

}