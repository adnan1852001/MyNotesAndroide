package com.example.mynotes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynotes.R
import com.example.mynotes.modles.modle2

class Adapter_secreen2 ( var context:Context, var restlist:ArrayList<modle2>): RecyclerView.Adapter<Adapter_secreen2.secAdpterViewHolder>() {

    inner class secAdpterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val  title= itemView.findViewById<TextView>(R.id.textNote)!!
        val  objectt= itemView.findViewById<TextView>(R.id.text180)!!


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): secAdpterViewHolder {
        val v=
                LayoutInflater.from(context).inflate(R.layout.rv_note_cell2,parent,false)
        return secAdpterViewHolder(v)
    }

    override fun getItemCount(): Int {
        return restlist.size    }

    override fun onBindViewHolder(holder: secAdpterViewHolder, position: Int) {
        holder.title.text=restlist[position].title
        holder.objectt.text=restlist[position].objectt    }
}