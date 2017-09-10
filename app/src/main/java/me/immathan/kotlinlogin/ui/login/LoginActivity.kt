/*
 *   Copyright (C) 2017 Mathan raj
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package me.immathan.kotlinlogin.ui.login

import android.content.Context
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

    companion object {
        fun getNewIntent(context: Context) = Intent(context,LoginActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginPresenter = LoginPresenter((application as SampleApplication).dataManager)

        loginPresenter.onAttach(this)
        loginPresenter.isLoggedIn()

        login.setOnClickListener {
            password.hideKeyboard()
            loginPresenter.doLogin(mobileNo.text.toString(), password.text.toString())
        }

        password.setOnEditorActionListener(TextView.OnEditorActionListener { _, id, _ ->
            if (id == R.id.otp || id == EditorInfo.IME_ACTION_DONE) {
                password.hideKeyboard()
                loginPresenter.doLogin(mobileNo.text.toString(), password.text.toString())
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
        finish()
    }

}
