package com.example.mynotes.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mynotes.databinding.ActivitySplashMainBinding

class Splash_MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        supportActionBar?.hide()
        Handler().postDelayed({

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)


        }, 3000)
    }
}