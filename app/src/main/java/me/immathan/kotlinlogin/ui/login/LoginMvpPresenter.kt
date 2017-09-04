package me.immathan.kotlinlogin.ui.login

import me.immathan.kotlinlogin.ui.base.MvpPresenter
import me.immathan.kotlinlogin.ui.base.MvpView

/**
 * Created by Mathan-GG on 05-Sep-17.
 */
interface LoginMvpPresenter<V: MvpView> : MvpPresenter<V> {

    fun getOTP(mobile : String)

}