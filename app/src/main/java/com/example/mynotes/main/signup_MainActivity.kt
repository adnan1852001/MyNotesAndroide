package com.example.mynotes.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynotes.databinding.ActivitySignupMainBinding

class signup_MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupMainBinding.inflate(layoutInflater)
        val veiw= binding.root
        setContentView(veiw)

        binding.arrow0.setOnClickListener{

                val intentt= Intent(this, MainActivity::class.java)
                startActivity(intentt)
        }
    }
}