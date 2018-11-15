package com.dukang.tushunet.mvp.mine

import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseFragment

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

    }

    override fun lazyLoad() {

    }

}