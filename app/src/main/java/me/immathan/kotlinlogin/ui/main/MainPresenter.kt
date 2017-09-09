package me.immathan.kotlinlogin.ui.main

import me.immathan.kotlinlogin.data.DataManager
import me.immathan.kotlinlogin.ui.base.BasePresenter

/**
 * Created by Mathan on 08-Sep-17.
 */
class MainPresenter<T : MainMvpView>(private val dataManager: DataManager) : BasePresenter<T>(), MainMvpPresenter<T> {

    override fun getName(): String? {
        return dataManager.getName()
    }

    override fun logout() {
        dataManager.saveToken("")
        mvpView?.gotoLoginActivity()
    }

}