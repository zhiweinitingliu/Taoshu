package com.dukang.tushunet.mvp.mine

import android.content.Intent
import android.view.View
import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseFragment
import com.dukang.tushunet.mvp.login.LoginActivity
import kotlinx.android.synthetic.main.fragment_mine.*

/**
 * @Description:我的
 * @Author:  wdk
 * @CreatTime: 2018/11/14 15:42
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/14 15:42
 * @LastCheckedBy: wdk
 */
class MineFragment : BaseFragment() {

    companion object {
        fun getInstance(): MineFragment {
            var mineFragment = MineFragment()
            return mineFragment
        }
    }

    override fun getLayoutId(): Int = R.layout.fragment_mine

    override fun initView() {
        btnLogin.setOnClickListener {
            var intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    override fun lazyLoad() {

    }

}