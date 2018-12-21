package com.dukang.tushunet.mvp.home.fragment

import android.view.View
import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseFragment
import kotlinx.android.synthetic.main.common_title.*
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * @Description:首页
 * @Author:  wdk
 * @CreatTime: 2018/11/14 15:42
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/14 15:42
 * @LastCheckedBy: wdk
 */
class HomeFragment : BaseFragment() {

    companion object {
        fun getInstance(): HomeFragment {
            val homeFragment = HomeFragment()
            return homeFragment
        }
    }

    override fun getLayoutId(): Int = R.layout.fragment_home

    override fun initView() {
        root_common_title.visibility = View.VISIBLE
        tv_title.text = "首页"
    }

    override fun lazyLoad() {

    }

}