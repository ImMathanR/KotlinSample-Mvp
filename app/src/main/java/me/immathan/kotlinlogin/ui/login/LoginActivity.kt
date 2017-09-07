package me.immathan.kotlinlogin.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login.*
import me.immathan.kotlinlogin.R
import me.immathan.kotlinlogin.ui.base.BaseActivity
import me.immathan.kotlinlogin.ui.main.MainActivity



class LoginActivity : BaseActivity(), LoginMvpView {

    private var mLoginPresenter: LoginPresenter<LoginMvpView> = LoginPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mLoginPresenter.onAttach(this)

        login.setOnClickListener {
            showProgress()
            mLoginPresenter.doLogin(mobileNo.text.toString(), password.text.toString())
        }
        password.setOnEditorActionListener(TextView.OnEditorActionListener { _, id, _ ->
            if (id == R.id.otp || id == EditorInfo.IME_ACTION_DONE) {
                showProgress()
                mLoginPresenter.doLogin(mobileNo.text.toString(), password.text.toString())
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
