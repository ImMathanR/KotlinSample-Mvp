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

package me.immathan.kotlinlogin.data.network

import me.immathan.kotlinlogin.data.LoginResponse
import retrofit2.Call

/**
 * Created by Mathan on 06-Sep-17.
 */
class AppApiHelper(private var mRestAdapter: RestAdapter) : ApiHelper {

    override fun doLogin(mobileNo: String, password: String): Call<LoginResponse> {
        return mRestAdapter.apiHelper.doLogin(mobileNo, password)
    }

}
