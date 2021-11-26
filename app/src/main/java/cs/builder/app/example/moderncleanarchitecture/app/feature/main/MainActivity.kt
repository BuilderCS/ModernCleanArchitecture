package cs.builder.app.example.moderncleanarchitecture.app.feature.main

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import cs.builder.app.example.moderncleanarchitecture.R
import cs.builder.app.example.moderncleanarchitecture.app.feature.splash.SplashAppCompatActivity

/** */
class MainActivity : SplashAppCompatActivity() {

    /** */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
    }

    /** */
    private fun setupViews() {
        setupBottomNavigationView()
    }

    /** */
    private fun setupBottomNavigationView() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
        val navController = (navHostFragment as NavHostFragment).navController
        findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
            .setupWithNavController(navController)
    }

}