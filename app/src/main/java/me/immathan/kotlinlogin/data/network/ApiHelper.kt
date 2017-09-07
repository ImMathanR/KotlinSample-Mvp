package me.immathan.kotlinlogin.data.network

import me.immathan.kotlinlogin.data.LoginResponse
import retrofit2.Call

/**
 * Created by Mathan-GG on 05-Sep-17.
 */

interface ApiHelper {

    fun doLogin(mobileNo: String, password: String) : Call<LoginResponse>

}
