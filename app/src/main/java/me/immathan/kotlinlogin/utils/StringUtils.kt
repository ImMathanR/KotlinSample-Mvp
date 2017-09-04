package me.immathan.kotlinlogin.utils

import android.text.TextUtils

/**
 * Created by Mathan-GG on 05-Sep-17.
 */

class StringUtils {

    companion object {

        fun isEmpty(value: String): Boolean {
            return !TextUtils.isEmpty(value)
        }

    }

}



