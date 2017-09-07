@file:JvmName("Utils")

package me.immathan.kotlinlogin.utils

import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by Mathan-GG on 02-Sep-17.
 */


val Context.connectivityManager: ConnectivityManager?
    get() = getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
