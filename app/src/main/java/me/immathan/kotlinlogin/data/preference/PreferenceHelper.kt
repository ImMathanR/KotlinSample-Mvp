package me.immathan.kotlinlogin.data.preference

/**
 * Created by Mathan-GG on 06-Sep-17.
 */
interface PreferenceHelper {

    fun getToken(): String?

    fun saveToken(token: String)

    fun saveName(name: String)

    fun getName(): String?

}