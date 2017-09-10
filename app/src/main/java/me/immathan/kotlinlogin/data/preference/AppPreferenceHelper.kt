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