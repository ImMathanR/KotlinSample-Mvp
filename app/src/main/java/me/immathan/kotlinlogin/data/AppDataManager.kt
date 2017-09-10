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

package me.immathan.kotlinlogin.data

import me.immathan.kotlinlogin.data.network.ApiHelper
import me.immathan.kotlinlogin.data.preference.PreferenceHelper
import retrofit2.Call

/**
 * Created by Mathan on 06-Sep-17.
 */
class AppDataManager (private val apiHelper: ApiHelper, private val preferenceHelper: PreferenceHelper): DataManager {

    override fun doLogin(mobileNo: String, password: String): Call<LoginResponse> {
        return apiHelper.doLogin(mobileNo, password)
    }

    override fun getToken(): String? {
        return preferenceHelper.getToken()
    }

    override fun saveToken(token: String) {
        preferenceHelper.saveToken(token)
    }

    override fun getName(): String? {
        return preferenceHelper.getName()
    }

    override fun saveName(name: String) {
        preferenceHelper.saveName(name)
    }

}