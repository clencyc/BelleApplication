package com.example.belle_app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.belle_app1.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(cart_fragment())

        binding.BottomNavigationView.setOnItemSelectedListener { item: MenuItem ->

            when (item.itemId) {
                R.id.home -> replaceFragment(cart_home())
                R.id.profile -> replaceFragment(cart_profile())
                R.id.colon -> replaceFragment(colon_fragment())
                R.id.cart -> replaceFragment(cart_fragment())

                else -> {

                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }
}

