package com.example.BelleApplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import android.widget.ImageView
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var card_section: ImageView
    lateinit var home_section: ImageView
    lateinit var account_section: ImageView
    lateinit var coin_section: ImageView
    lateinit var user_section: ImageView
    lateinit var BTN_001: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //card_section = findViewById(R.id.cardsection)
        home_section = findViewById(R.id.homesection)
        account_section = findViewById(R.id.accountsection)
        //coin_section = findViewById(R.id.coinsection)
        //user_section = findViewById(R.id.usersection)
        //BTN_001 = findViewById(R.id.btn001)

        home_section.setOnClickListener{
            var gotohome = Intent(this, MainActivity::class.java)
            startActivity(gotohome)
        }

        account_section.setOnClickListener{
            var gotoaccount = Intent(this, accountsactivity::class.java)
            startActivity(gotoaccount)
        }

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.homeFragment) as HomeFragment
        val navController = navHostFragment.findNavController()
        findViewById<BottomNavigationView>(R.id.bottom_bar)
            .setupWithNavController(navController)
    }
}