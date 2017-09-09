package me.immathan.kotlinlogin.ui.main

import me.immathan.kotlinlogin.ui.base.MvpPresenter
import me.immathan.kotlinlogin.ui.base.MvpView

/**
 * Created by Mathan-GG on 08-Sep-17.
 */
interface MainMvpPresenter<T: MvpView> : MvpPresenter<T> {

    fun logout()

    fun getName(): String?

}