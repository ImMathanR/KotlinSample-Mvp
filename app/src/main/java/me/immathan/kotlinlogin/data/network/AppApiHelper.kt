package me.immathan.kotlinlogin.data.network

import me.immathan.kotlinlogin.data.LoginResponse
import retrofit2.Call

/**
 * Created by Mathan-GG on 06-Sep-17.
 */
class AppApiHelper(private var mRestAdapter: RestAdapter) : ApiHelper {

    override fun doLogin(mobileNo: String, password: String): Call<LoginResponse> {
        return mRestAdapter.apiHelper.doLogin(mobileNo, password)
    }

}
