package com.example.mynotes.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mynotes.adapter.RestAdapter
import com.example.mynotes.databinding.ActivityMainRecyceler2Binding
import com.example.mynotes.modles.modle2

class Main_Recyceler2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainRecyceler2Binding
    private val restlist= ArrayList<modle2>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainRecyceler2Binding.inflate(layoutInflater)
        val veiw= binding.root
        setContentView(veiw)

    }

   }