package com.dukang.tushunet.mvp.publish

import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseFragment

/**
 * @Description:发布
 * @Author:  wdk
 * @CreatTime: 2018/11/14 15:42
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/14 15:42
 * @LastCheckedBy: wdk
 */
class PublishFragment : BaseFragment() {

    companion object {
        fun getInstance(): PublishFragment {
            var publishFragment = PublishFragment()
            return publishFragment
        }
    }

    override fun getLayoutId(): Int = R.layout.fragment_publish

    override fun initView() {

    }

    override fun lazyLoad() {

    }

}