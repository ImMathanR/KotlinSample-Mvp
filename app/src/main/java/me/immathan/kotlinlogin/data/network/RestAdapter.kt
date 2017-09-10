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

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Mathan on 06-Sep-17.
 */
class RestAdapter {

    companion object {
        private val API_BASE = "https://us-central1-friendly-chat-4a901.cloudfunctions.net/"
    }

    val apiHelper: ApiHelper

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(API_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        apiHelper = retrofit.create(ApiHelper::class.java)
    }
}
