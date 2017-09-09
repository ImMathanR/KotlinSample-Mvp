package me.immathan.kotlinlogin.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login.*
import me.immathan.kotlinlogin.R
import me.immathan.kotlinlogin.SampleApplication
import me.immathan.kotlinlogin.ui.base.BaseActivity
import me.immathan.kotlinlogin.ui.main.MainActivity
import me.immathan.kotlinlogin.utils.hideKeyboard


class LoginActivity : BaseActivity(), LoginMvpView {

    private lateinit var loginPresenter: LoginPresenter<LoginMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginPresenter = LoginPresenter((application as SampleApplication).dataManager)

        loginPresenter.onAttach(this)

        login.setOnClickListener {
            showProgress()
            loginPresenter.doLogin(mobileNo.text.toString(), password.text.toString())
            hideKeyboard(password)
        }

        password.setOnEditorActionListener(TextView.OnEditorActionListener { _, id, _ ->
            if (id == R.id.otp || id == EditorInfo.IME_ACTION_DONE) {
                showProgress()
                loginPresenter.doLogin(mobileNo.text.toString(), password.text.toString())
                hideKeyboard(password)
                return@OnEditorActionListener true
            }
            false
        })
    }

    override fun showError(message: String) {
        onError(message)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
