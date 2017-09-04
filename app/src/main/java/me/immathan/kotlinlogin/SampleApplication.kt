package me.immathan.kotlinlogin

import android.app.Application
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

/**
 * Created by Mathan-GG on 02-Sep-17.
 */
class SampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val calligraphyConfig = CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Quicksand-Regular.ttf")
                .build()
        CalligraphyConfig.initDefault(calligraphyConfig)
    }

}