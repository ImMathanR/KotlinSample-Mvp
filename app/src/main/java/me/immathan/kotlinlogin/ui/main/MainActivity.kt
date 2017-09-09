package me.immathan.kotlinlogin.ui.main

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import me.immathan.kotlinlogin.R
import me.immathan.kotlinlogin.SampleApplication
import me.immathan.kotlinlogin.ui.base.BaseActivity
import me.immathan.kotlinlogin.ui.login.LoginActivity




/**
 * Created by Mathan-GG on 05-Sep-17.
 */
class MainActivity : BaseActivity(), MainMvpView {

    private lateinit var mainPresenter: MainPresenter<MainMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter((application as SampleApplication).dataManager)
        mainPresenter.onAttach(this)
        name.text = mainPresenter.getName()
        logout.setOnClickListener {
            mainPresenter.logout()
        }

    }

    override fun onStart() {
        super.onStart()

        tick.post({
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val startRadius = 0
                val cx = tick.width / 2
                val cy = tick.height / 2
                val endRadius = Math.hypot(tick.width.toDouble(), tick.height.toDouble()).toInt()
                val anim = ViewAnimationUtils.createCircularReveal(tick, cx, cy, startRadius.toFloat(), endRadius.toFloat())
                anim.duration = 1000
                tick.visibility = View.VISIBLE
                anim.start()
            }
        })
    }

    override fun gotoLoginActivity() {
        val intent = LoginActivity.getNewIntent(applicationContext)
        startActivity(intent)
        finish()
    }

}