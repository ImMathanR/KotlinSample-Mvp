package me.immathan.kotlinlogin.data.preference

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by Mathan on 09-Sep-17.
 */
class AppPreferenceHelper(context: Context, fileName: String, private var sharedPreferences: SharedPreferences? = null) : PreferenceHelper {

    companion object {
        val TOKEN_KEY = "token_id"
        val NAME = "name"
    }

    init {
        sharedPreferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
    }

    override fun getToken(): String? = sharedPreferences?.getString(TOKEN_KEY, "")

    override fun saveToken(token: String) {
        val editor: SharedPreferences.Editor = sharedPreferences!!.edit()
        editor.putString(TOKEN_KEY, token)
        editor.apply()
    }

    override fun saveName(name: String) {
        val editor: SharedPreferences.Editor = sharedPreferences!!.edit()
        editor.putString(NAME, name)
        editor.apply()
    }

    override fun getName(): String? = sharedPreferences?.getString(NAME, "")

}