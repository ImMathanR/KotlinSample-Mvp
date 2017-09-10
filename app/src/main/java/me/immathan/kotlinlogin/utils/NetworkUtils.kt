/*
 *   Copyright (C) 2017 Mathan raj
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package me.immathan.kotlinlogin.utils

import android.content.Context

/**
 * Created by Mathan on 04-Sep-17.
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