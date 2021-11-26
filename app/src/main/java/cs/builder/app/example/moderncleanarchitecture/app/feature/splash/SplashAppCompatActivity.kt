package cs.builder.app.example.moderncleanarchitecture.app.feature.splash

import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

/** */
abstract class SplashAppCompatActivity : AppCompatActivity() {

    /* */
    private var splashDelay: Long = 1_500L

    /** */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setupSplashDuration()
    }

    /** */
    private fun setupSplashDuration() {
        val required: Long = System.currentTimeMillis() + splashDelay
        val content: View = findViewById(android.R.id.content)
        content.viewTreeObserver.addOnPreDrawListener(object : ViewTreeObserver.OnPreDrawListener {
            override fun onPreDraw(): Boolean {
                return if (System.currentTimeMillis() >= required) {
                    content.viewTreeObserver.removeOnPreDrawListener(this)
                    true
                } else false
            }
        })
    }

}