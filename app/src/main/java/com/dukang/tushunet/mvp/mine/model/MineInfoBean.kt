package com.dukang.tushunet.mvp.mine.model

/**
 * @Description : 我的
 * @Author : wdk
 * @CretaTime : 2018/12/8 15:00
 * @LastModify(最终修改人) :wdk
 * @LastModifyTime(最终修改时间) : 2018/12/8 15:00
 * @LastCheckBy :wdk
 */
data class MineInfoBean(
        var user_info: UserInfoBean
)

data class UserInfoBean(var id: Int,
                        var user_name: String)



