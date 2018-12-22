package com.dukang.tushunet.mvp.mine.fragment

import android.content.Intent
import android.text.TextUtils
import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseFragment
import com.dukang.tushunet.common.utils.IntentManager
import com.dukang.tushunet.common.utils.UserInfoUtil
import com.dukang.tushunet.mvp.mine.activity.LoginActivity
import com.dukang.tushunet.mvp.mine.activity.SettingActivity
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
            return MineFragment()
        }
    }

    override fun getLayoutId(): Int = R.layout.fragment_mine

    override fun initView() {

        iv_user_head.setOnClickListener {
            if (TextUtils.isEmpty(UserInfoUtil.getUserToken())) {
                var intent = Intent(activity, LoginActivity::class.java)
                startActivity(intent)
            }
        }

        iv_tools.setOnClickListener {
            IntentManager.startActivity(activity, SettingActivity::class.java)
        }
    }

    override fun lazyLoad() {

    }

    override fun onResume() {
        super.onResume()
        if (TextUtils.isEmpty(UserInfoUtil.getUserToken())) {
            tv_user_name.text = "未登录"
        } else {
            mineInfoPresenter.getMineInfo()
        }
    }

    override fun callBackUserInfo(mineInfoBean: MineInfoBean) {
        tv_user_name.text = mineInfoBean.user_info.user_name
    }

}