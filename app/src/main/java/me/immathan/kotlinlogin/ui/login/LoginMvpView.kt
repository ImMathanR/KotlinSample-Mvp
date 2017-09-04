package me.immathan.kotlinlogin.ui.login

import me.immathan.kotlinlogin.ui.base.MvpView

/**
 * Created by Mathan-GG on 05-Sep-17.
 */
interface LoginMvpView : MvpView{

    fun openMainActivity()

    fun showError(message: String)

}