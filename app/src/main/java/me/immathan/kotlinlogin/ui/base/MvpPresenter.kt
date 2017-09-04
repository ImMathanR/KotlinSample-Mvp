package me.immathan.kotlinlogin.ui.base

/**
 * Created by Mathan-GG on 05-Sep-17.
 */
interface MvpPresenter<V : MvpView> {

    fun onAttach(mvpView: V)

    fun onDetach()

}