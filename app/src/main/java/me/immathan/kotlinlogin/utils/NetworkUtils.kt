package me.immathan.kotlinlogin.utils

import android.content.Context

/**
 * Created by Mathan-GG on 04-Sep-17.
 */
class NetworkUtils {

    companion object {

        /**
         * Extension method to get connectivityManager for Context.
         */

        fun isNetworkConnected(con : Context): Boolean {
            return con.connectivityManager?.activeNetworkInfo != null
        }
    }

}