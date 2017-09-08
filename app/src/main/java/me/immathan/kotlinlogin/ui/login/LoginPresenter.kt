package me.immathan.kotlinlogin.ui.login

import android.text.TextUtils
import android.util.Log
import com.google.gson.Gson
import me.immathan.kotlinlogin.data.DataManager
import me.immathan.kotlinlogin.data.LoginResponse
import me.immathan.kotlinlogin.ui.base.BasePresenter
import me.immathan.kotlinlogin.utils.Logger
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Mathan-GG on 05-Sep-17.
 */
class LoginPresenter<V : LoginMvpView>(private val dataManager: DataManager) : BasePresenter<V>(), LoginMvpPresenter<V> {

    companion object {
        private val TAG: String = LoginPresenter::class.java.simpleName
    }

    override fun doLogin(mobile: String, password: String) {
        if (TextUtils.isEmpty(mobile)) {
            mvpView?.onError("Enter valid mobile number")
            return
        }

        if (TextUtils.isEmpty(password)) {
            mvpView?.onError("Enter valid password")
            return
        }

        mvpView?.showProgress()
        Logger.d(TAG, "Sending login request")
        dataManager.doLogin(mobile, password).enqueue(object : Callback<LoginResponse?> {
            override fun onFailure(call: Call<LoginResponse?>?, t: Throwable?) {
                Log.e(TAG, "Login failure")
                mvpView?.hideProgress()
                mvpView?.onError(t?.localizedMessage!!)
            }

            override fun onResponse(call: Call<LoginResponse?>?, response: Response<LoginResponse?>?) {
                mvpView?.hideProgress()
                if (response != null && response.isSuccessful) {
                    mvpView?.openMainActivity()
                    Logger.d(TAG, "Login success")
                } else {
                    if(response?.errorBody() != null) {
                        Log.e(TAG, "Login not success")
                        val gson = Gson()
                        val loginResponse = gson.fromJson(response.errorBody()!!.string(), LoginResponse::class.java)
                        mvpView?.onError(loginResponse.message)
                    }
                }
            }
        })
    }

}