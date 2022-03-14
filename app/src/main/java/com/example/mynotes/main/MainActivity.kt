package com.example.mynotes.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val veiw=binding.root
        setContentView(veiw)

        binding.signUp.setOnClickListener{
            val intentt= Intent(this, signup_MainActivity::class.java)
            startActivity(intentt)
    }
        binding.longBtn.setOnClickListener{
            val intentt= Intent(this, MainRecyceler::class.java)
            startActivity(intentt)
        }

    }}
