package me.immathan.kotlinlogin.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory




/**
 * Created by Mathan-GG on 06-Sep-17.
 */
class RestAdapter(private var mApiHelper: ApiHelper) {

    private val API_BASE = "https://api.quikiride.com/v1.0/"

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(API_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        mApiHelper = retrofit.create(ApiHelper::class.java)
    }

    fun getApiHelper(): ApiHelper {
        return mApiHelper
    }
}
