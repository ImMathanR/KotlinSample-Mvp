package me.immathan.kotlinlogin.utils

import android.text.TextUtils

/**
 * Created by Mathan-GG on 05-Sep-17.
 */

class StringUtils {

    companion object {

        fun isNotEmpty(value: String): Boolean {
            return !TextUtils.isEmpty(value)
        }

    }

}



