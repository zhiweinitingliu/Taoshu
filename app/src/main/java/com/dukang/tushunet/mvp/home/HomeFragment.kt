package com.dukang.tushunet.mvp.home

import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseFragment

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

    }

    override fun lazyLoad() {

    }

}