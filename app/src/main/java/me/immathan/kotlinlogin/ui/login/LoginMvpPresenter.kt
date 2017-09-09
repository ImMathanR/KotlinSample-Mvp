package me.immathan.kotlinlogin.ui.login

import me.immathan.kotlinlogin.ui.base.MvpPresenter
import me.immathan.kotlinlogin.ui.base.MvpView

/**
 * Created by Mathan on 05-Sep-17.
 */
interface LoginMvpPresenter<V: MvpView> : MvpPresenter<V> {

    fun doLogin(mobile : String, password: String)

    fun isLoggedIn()

}