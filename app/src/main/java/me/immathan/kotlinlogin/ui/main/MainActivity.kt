package me.immathan.kotlinlogin.ui.main

import android.os.Bundle
import me.immathan.kotlinlogin.R
import me.immathan.kotlinlogin.ui.base.BaseActivity

/**
 * Created by Mathan-GG on 05-Sep-17.
 */
class MainActivity : BaseActivity(), MainMvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showGreetings(message: String) {
        showMessage(message)
    }

}