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

import android.util.Log

/**
 * Created by Mathan on 08-Sep-17.
 */
class Logger {

    companion object {
        private val LOG_TAG: String = "KOTLIN_SAMPLE"
        private val DEBUG = Log.isLoggable(LOG_TAG, Log.DEBUG)

        fun i(tag: String, msg: String) {
            Log.i(tag, msg)
        }

        fun d(tag: String, msg: String) {
            if (DEBUG) {
                Log.v(tag, msg)
            }
        }

        fun e(tag: String, msg: String) {
            Log.e(tag, msg)
        }

        fun e(tag: String, msg: String, e: Exception) {
            Log.e(tag, msg + "\nException: " + e.message)
            e.printStackTrace()
        }

    }

}