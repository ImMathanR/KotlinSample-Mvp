package me.immathan.kotlinlogin.ui.base

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import me.immathan.kotlinlogin.R
import me.immathan.kotlinlogin.utils.NetworkUtils
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper



/**
 * Created by Mathan-GG on 02-Sep-17.
 */
abstract class BaseActivity : AppCompatActivity(), MvpView {

    private var mProgressDialog:ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createProgressBar()
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        createProgressBar()
    }

    fun createProgressBar() {
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setMessage(getString(R.string.please_wait))
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

    override fun showProgress() {
        mProgressDialog?.show()
    }

    override fun hideProgress() {
        mProgressDialog?.hide()
    }

    override fun showMessage(message: String) {
        showSnackBar(message)
    }

    private fun showSnackBar(message: String) {
        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show()
    }

    override fun onError(error: String) {
        showSnackBar(error)
    }

    override fun onError(resId: Int) {
        showSnackBar(getString(resId))
    }

    override fun isNetworkConnected(): Boolean {
        return NetworkUtils.isNetworkConnected(applicationContext)
    }


}