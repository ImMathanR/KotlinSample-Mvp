package me.immathan.kotlinlogin.utils

import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by Mathan-GG on 04-Sep-17.
 */
class NetworkUtils {

    companion object {

        /**
         * Extension method to get connectivityManager for Context.
         */
        private val Context.connectivityManager: ConnectivityManager?
            get() = getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager

        fun isNetworkConnected(con : Context): Boolean {
            return con.connectivityManager?.activeNetworkInfo != null
        }
    }

}