package com.dukang.tushunet.mvp.home.activity

import android.support.v4.app.FragmentTransaction
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.dukang.tushunet.R
import com.dukang.tushunet.base.BaseActivity
import com.dukang.tushunet.mvp.mine.fragment.MineFragment
import com.dukang.tushunet.mvp.publish.PublishFragment
import kotlinx.android.synthetic.main.activity_main.*
import com.ashokvarma.bottomnavigation.BottomNavigationItem
import com.ashokvarma.bottomnavigation.TextBadgeItem
import com.dukang.tushunet.mvp.home.fragment.HomeFragment

/**
 * @Description:
 * @Author:  wdk
 * @CreatTime: 2018/11/13 14:40
 * @LastModify: wdk
 * @LastModifyTime: 2018/11/13 14:40
 * @LastCheckedBy: wdk
 */
class MainActivity : BaseActivity(R.layout.activity_main) {
    private var homeFragment: HomeFragment? = null
    private var publishFragment: PublishFragment? = null
    private var mineFragment: MineFragment? = null
    private lateinit var numberBadgeItem: TextBadgeItem

    override fun initView() {
        numberBadgeItem = TextBadgeItem()
        numberBadgeItem?.setBorderWidth(4)
                ?.setBackgroundColorResource(R.color.colorF82C52)
                ?.setText("111")
                ?.setHideOnSelect(true)

        navigation.addItem(BottomNavigationItem(R.drawable.ic_home_black_24dp, "Home"))
                .addItem(BottomNavigationItem(R.drawable.ic_dashboard_black_24dp, "publish").setBadgeItem(numberBadgeItem))
                .addItem(BottomNavigationItem(R.drawable.ic_notifications_black_24dp, "mine"))
                .setFirstSelectedPosition(0)
                .initialise()
    }

    override fun initListener() {
        navigation.setTabSelectedListener(mOnNavigationItemSelectedListener)
        tabSwitch(0)
    }

    override fun initData() {

    }

    private val mOnNavigationItemSelectedListener = object : BottomNavigationBar.SimpleOnTabSelectedListener() {

        override fun onTabSelected(position: Int) {
            when (position) {
                0 -> {
                    tabSwitch(0)
                }
                1 -> {
                    tabSwitch(1)
                }
                2 -> {
                    tabSwitch(2)
                }
            }
        }

    }

    private fun tabSwitch(position: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        hideFragments(transaction)
        when (position) {
            0
            -> switchToHome(transaction)
            1
            -> switchToPublish(transaction)
            2
            -> switchToMine(transaction)
            else -> {

            }
        }
        transaction.commitAllowingStateLoss()
    }

    private fun hideFragments(transaction: FragmentTransaction) {
        homeFragment?.let { transaction.hide(it) }
        publishFragment?.let { transaction.hide(it) }
        mineFragment?.let { transaction.hide(it) }
    }

    private fun switchToHome(transaction: FragmentTransaction) {

        homeFragment?.let {
            transaction.show(it)
        } ?: HomeFragment.getInstance()?.let {
            homeFragment = it
            transaction.add(R.id.fl_container, it, "home")
        }
    }

    private fun switchToPublish(transaction: FragmentTransaction) {

        publishFragment?.let {
            transaction.show(it)
        } ?: PublishFragment.getInstance()?.let {
            publishFragment = it
            transaction.add(R.id.fl_container, it, "publish")
        }

    }

    private fun switchToMine(transaction: FragmentTransaction) {
        mineFragment?.let {
            transaction.show(it)
        } ?: MineFragment.getInstance()?.let {
            mineFragment = it
            transaction.add(R.id.fl_container, it, "publish")
        }
    }

}