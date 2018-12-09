package com.dukang.tushunet.mvp.login

import android.support.design.widget.Snackbar
import android.text.TextUtils
import android.widget.Toast
import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseActivity
import com.dukang.tushunet.mvp.login.model.LoginModel
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

    lateinit var loginPresenter: ILoginPresenter

    override fun initView() {
        loginPresenter = LoginPresenterCompl(this)
    }

    override fun initListener() {
        btn_login.setOnClickListener {
            var userName = et_user_name.text.toString()
            var password = et_password.text.toString()
            if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(password)) {
                loginPresenter.doLogin(userName, password)
            } else {
                Snackbar.make(ll_root, "请输入用户名或密码", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    override fun initData() {

    }

    override fun loginResult(json: String) {
        Toast.makeText(this, "登录成功", Toast.LENGTH_LONG).show()
        tvJson.setText(json)
    }

}