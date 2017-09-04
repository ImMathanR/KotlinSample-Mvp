package me.immathan.kotlinlogin.ui.base

/**
 * Created by Mathan-GG on 05-Sep-17.
 */
open class BasePresenter<V : MvpView> : MvpPresenter<V> {

    var mMvpView: V? = null

    override fun onAttach(mvpView: V) {
        mMvpView = mvpView
    }

    override fun onDetach() {
        mMvpView = null
    }

}