package com.example.mynotes.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mynotes.adapter.RestAdapter
import com.example.mynotes.databinding.ActivityMainRecycelerBinding
import com.example.mynotes.modles.Note

class MainRecyceler : AppCompatActivity() {
    private lateinit var binding:ActivityMainRecycelerBinding
    private val restlist= ArrayList<Note>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainRecycelerBinding.inflate(layoutInflater)
        val veiw= binding.root
        setContentView(veiw)
        val lm= LinearLayoutManager(this)
        binding.Recycleviwe.layoutManager= lm
        populateArray()
        val adapter = RestAdapter(this, restlist)
        binding.Recycleviwe.adapter=adapter


    }
    fun populateArray(){

        val R1= Note(1, "Work", "Notes for work...")
        val R2= Note(2, "Work", "Notes for work...")
        val R3= Note(3, "Cooking", "Notes for Cooking...")
        val R4= Note(4, "Cooking", "Notes for Cooking...")
        val R5= Note(5, "Work", "Notes for work...")
        val R6= Note(6, "Note", "Notes for Note...")
        val R7= Note(7, "Cooking", "Notes for Cooking...")
        val R8= Note(8, "Note", "Notes for Note...")
        val R9= Note(9, "Work", "Notes for work...")
        val R10= Note(10, "Work", "Notes for work...")
        val R11= Note(11, "Cooking", "Notes for Cooking...")
        val R12= Note(12, "Cooking", "Notes for Cooking...")
        val R13= Note(13, "Work", "Notes for work...")
        val R14= Note(14, "Note", "Notes for Note...")
        val R15= Note(15, "Cooking", "Notes for Cooking...")
        val R16= Note(16, "Note", "Notes for Note...")

        restlist.add(R1)
        restlist.add(R2)
        restlist.add(R3)
        restlist.add(R4)
        restlist.add(R5)
        restlist.add(R6)
        restlist.add(R7)
        restlist.add(R8)
        restlist.add(R9)
        restlist.add(R10)
        restlist.add(R11)
        restlist.add(R12)
        restlist.add(R13)
        restlist.add(R15)
        restlist.add(R15)
        restlist.add(R16)
           }
}