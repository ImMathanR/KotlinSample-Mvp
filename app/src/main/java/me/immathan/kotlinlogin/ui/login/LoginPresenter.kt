package me.immathan.kotlinlogin.ui.login

import me.immathan.kotlinlogin.ui.base.BasePresenter
import me.immathan.kotlinlogin.ui.base.MvpView
import me.immathan.kotlinlogin.utils.StringUtils

/**
 * Created by Mathan-GG on 05-Sep-17.
 */
class LoginPresenter<V : MvpView> : BasePresenter<V>(), LoginMvpPresenter<V> {

    override fun getOTP(mobile: String) {
        if(StringUtils.isEmpty(mobile)) {

        }
    }

}