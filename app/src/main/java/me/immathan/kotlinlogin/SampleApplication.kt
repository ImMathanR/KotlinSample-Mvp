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

package me.immathan.kotlinlogin

import android.app.Application
import me.immathan.kotlinlogin.data.AppDataManager
import me.immathan.kotlinlogin.data.DataManager
import me.immathan.kotlinlogin.data.network.ApiHelper
import me.immathan.kotlinlogin.data.network.AppApiHelper
import me.immathan.kotlinlogin.data.network.RestAdapter
import me.immathan.kotlinlogin.data.preference.AppPreferenceHelper
import me.immathan.kotlinlogin.data.preference.PreferenceHelper
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

/**
 * Created by Mathan on 02-Sep-17.
 */
class SampleApplication : Application() {

    lateinit var dataManager: DataManager
    lateinit var apiHelper: ApiHelper
    lateinit var restAdapter: RestAdapter
    lateinit var prefHelper: PreferenceHelper

    companion object {
        val FILE_NAME: String = "kotlin_sample"
    }

    override fun onCreate() {
        super.onCreate()
        val calligraphyConfig = CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/GothamRoundedMedium.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        CalligraphyConfig.initDefault(calligraphyConfig)
        restAdapter = RestAdapter()
        apiHelper = AppApiHelper(restAdapter)
        prefHelper = AppPreferenceHelper(applicationContext, FILE_NAME)
        dataManager = AppDataManager(apiHelper, prefHelper)
    }

}