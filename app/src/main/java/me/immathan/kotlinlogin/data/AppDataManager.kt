package me.immathan.kotlinlogin.data

import me.immathan.kotlinlogin.data.network.ApiHelper
import me.immathan.kotlinlogin.data.preference.PreferenceHelper
import retrofit2.Call

/**
 * Created by Mathan-GG on 06-Sep-17.
 */
class AppDataManager (private val apiHelper: ApiHelper, private val preferenceHelper: PreferenceHelper): DataManager {

    override fun doLogin(mobileNo: String, password: String): Call<LoginResponse> {
        return apiHelper.doLogin(mobileNo, password)
    }

    override fun getToken(): String? {
        return preferenceHelper.getToken()
    }

    override fun saveToken(token: String) {
        preferenceHelper.saveToken(token)
    }

    override fun getName(): String? {
        return preferenceHelper.getName()
    }

    override fun saveName(name: String) {
        preferenceHelper.saveName(name)
    }

}