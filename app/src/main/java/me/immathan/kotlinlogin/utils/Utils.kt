@file:JvmName("Utils")

package me.immathan.kotlinlogin.utils

import android.content.Context
import android.net.ConnectivityManager
import android.view.View
import android.view.inputmethod.InputMethodManager

/**
 * Created by Mathan-GG on 02-Sep-17.
 */


val Context.connectivityManager: ConnectivityManager?
    get() = getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager

fun hideKeyboard(view: View) {
    val imm = view.context.getSystemService(
            Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(view.windowToken, 0)
    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
}