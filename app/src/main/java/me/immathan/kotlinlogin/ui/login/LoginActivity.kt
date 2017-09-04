package me.immathan.kotlinlogin.ui.login

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import me.immathan.kotlinlogin.R
import me.immathan.kotlinlogin.ui.base.BaseActivity
import me.immathan.kotlinlogin.ui.main.MainActivity

class LoginActivity : BaseActivity(), LoginMvpView {

    private var loginPresenter: LoginPresenter<LoginMvpView> = LoginPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginPresenter.onAttach(this)

        getOtp.setOnClickListener {
            showProgress()
            loginPresenter.getOTP(otp.text.toString())
        }
    }

    override fun showError(message: String) {
        onError(message)
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

}
