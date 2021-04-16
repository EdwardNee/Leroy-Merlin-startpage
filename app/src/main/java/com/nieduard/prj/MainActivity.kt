package com.nieduard.prj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nieduard.fragments.CartFragment
import com.nieduard.fragments.MainFragment
import com.nieduard.fragments.ProfileFragment
import com.nieduard.fragments.StoresFragment
import java.security.InvalidParameterException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
            moveToFragment(MainFragment())

        val navigationBar = findViewById<BottomNavigationView>(R.id.nav_bar)
        //Set the click listener on nav bar.
        navigationBar.setOnNavigationItemSelectedListener {
            val frag = when (it.itemId) {
                R.id.main -> MainFragment()
                R.id.list -> ListFragment()
                R.id.shops -> StoresFragment()
                R.id.profile -> ProfileFragment()
                R.id.cart -> CartFragment()
                else -> throw InvalidParameterException()
            }
            moveToFragment(frag)
            true
        }
    }

    /**
     * Begins transaction to a selected on a navigation bar fragment.
     */
    private fun moveToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_wrapper, fragment)
            .addToBackStack(fragment.javaClass.name)
            .commit()
    }
}