package me.immathan.kotlinlogin.ui.base

/**
 * Created by Mathan-GG on 05-Sep-17.
 */
open class BasePresenter<V : MvpView> : MvpPresenter<V> {

    var mvpView: V? = null

    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }

    override fun onDetach() {
        mvpView = null
    }

}