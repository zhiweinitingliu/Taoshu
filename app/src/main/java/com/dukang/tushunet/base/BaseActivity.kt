package com.dukang.tushunet.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dukang.tushunet.R
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.common_title.*

/**
 * @Description:baseActivity
 * @Author:  wdk
 * @CreatTime: 2018/11/13 14:16
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/13 14:16
 * @LastCheckedBy: wdk
 */
open abstract class BaseActivity(var layout_id: Int) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        setContentLayout()
        initView()
        initListener()
        initData()
    }

    private fun setContentLayout() {
        var view = LayoutInflater.from(this).inflate(layout_id, null, false)
        ll_root.addView(view, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
    }

    abstract fun initView()

    abstract fun initListener()

    abstract fun initData()

    fun setTitle(title: String) {
        tv_title.text = title
        root_common_title.visibility = View.VISIBLE
        iv_back.visibility = View.VISIBLE
    }

    fun setTitleNoBack(title: String) {
        tv_title.text = title
        root_common_title.visibility = View.VISIBLE
        iv_back.visibility = View.GONE
    }

}