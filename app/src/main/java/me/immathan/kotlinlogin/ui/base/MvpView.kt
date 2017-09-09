package me.immathan.kotlinlogin.ui.base

import android.support.annotation.StringRes

/**
 * Created by Mathan on 02-Sep-17.
 */
interface MvpView {

    fun showProgress()

    fun hideProgress()

    fun onError(@StringRes resId : Int)

    fun onError(error : String)

    fun showMessage(message : String)

    fun isNetworkConnected() : Boolean

}