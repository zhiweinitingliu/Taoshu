package com.dukang.tushunet.mvp.mine.activity

import android.text.TextUtils
import android.view.View
import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseActivity
import com.dukang.tushunet.common.utils.UserInfoUtil
import kotlinx.android.synthetic.main.act_setting.*

/**
 * @Description :
 * @Author : wdk
 * @CretaTime : 2018/12/22 16:15
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/22 16:15
 * @LastCheckBy :wdk
 */
class SettingActivity : BaseActivity(R.layout.act_setting) {

    override fun initView() {
        setTitle("设置")
        if (!TextUtils.isEmpty(UserInfoUtil.getUserToken())) {
            btn_exit_login.visibility = View.VISIBLE
        } else {
            btn_exit_login.visibility = View.GONE
        }
    }

    override fun initListener() {
        btn_exit_login.setOnClickListener {
            UserInfoUtil.saveUserToken("")
            finish()
        }
    }

    override fun initData() {

    }

}