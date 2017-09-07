package me.immathan.kotlinlogin.data.network

import me.immathan.kotlinlogin.data.LoginResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Mathan-GG on 07-Sep-17.
 */

class DumpClass(private val mRestAdapter: RestAdapter) {

    fun doLogin(mobileNo: String, password: String) {
        mRestAdapter.apiHelper.doLogin(mobileNo, password).enqueue(object : Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {

            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {

            }
        })
    }

}
