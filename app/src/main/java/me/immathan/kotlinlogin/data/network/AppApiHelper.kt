package me.immathan.kotlinlogin.data.network

import me.immathan.kotlinlogin.data.LoginResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Mathan-GG on 06-Sep-17.
 */
class AppApiHelper(private var mRestAdapter: RestAdapter) : ApiHelper {

    override fun doLogin(mobileNo: String, password: String): Call<LoginResponse> {
        mRestAdapter.getApiHelper().doLogin(mobileNo, password).enqueue(object : Callback(), Callback<LoginResponse> {

            override fun onResponse(call: Call<LoginResponse>?, response: Response<LoginResponse>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFailure(call: Call<LoginResponse>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }


}

}
