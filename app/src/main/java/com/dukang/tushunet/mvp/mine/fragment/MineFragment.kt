package com.dukang.tushunet.mvp.mine.fragment

import android.content.Intent
import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseFragment
import com.dukang.tushunet.mvp.mine.activity.LoginActivity
import com.dukang.tushunet.mvp.mine.model.MineInfoBean
import com.dukang.tushunet.mvp.mine.presenter.MineInfoPresenter
import com.dukang.tushunet.mvp.mine.presenter.MineInfoPresenterImpl
import com.dukang.tushunet.mvp.mine.view.IMineView
import kotlinx.android.synthetic.main.fragment_mine.*

/**
 * @Description:我的
 * @Author:  wdk
 * @CreatTime: 2018/11/14 15:42
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/14 15:42
 * @LastCheckedBy: wdk
 */
class MineFragment : BaseFragment(), IMineView {

    private var mineInfoPresenter: MineInfoPresenter = MineInfoPresenterImpl(this)

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

        btnMine.setOnClickListener {
            mineInfoPresenter.getMineInfo()

        }
    }

    override fun lazyLoad() {

    }

    override fun callBackUserInfo(mineInfoBean: MineInfoBean) {
        tv_user_name.setText(mineInfoBean.user_info.user_name)
    }

}