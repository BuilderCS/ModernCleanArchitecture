package cs.builder.app.example.moderncleanarchitecture.app.feature.main

import android.os.Bundle
import cs.builder.app.example.moderncleanarchitecture.R
import cs.builder.app.example.moderncleanarchitecture.app.feature.splash.SplashAppCompatActivity

/** */
class MainActivity : SplashAppCompatActivity() {

    /** */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}