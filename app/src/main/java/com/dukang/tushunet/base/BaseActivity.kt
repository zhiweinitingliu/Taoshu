package com.dukang.tushunet.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

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
        setContentView(layout_id)
        initView()
        initListener()
        initData()
    }

    abstract fun initView()
    abstract fun initListener()
    abstract fun initData()
}