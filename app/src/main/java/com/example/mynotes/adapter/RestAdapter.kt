package com.example.mynotes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynotes.R
import com.example.mynotes.modles.Note

class RestAdapter(var context:Context, var restlist: ArrayList<Note>): RecyclerView.Adapter<RestAdapter.RestviewHolder>() {

    inner class RestviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val  char_shape= itemView.findViewById<TextView>(R.id.char_shape)!!
        val address = itemView.findViewById<TextView>(R.id.address)!!
        val title = itemView.findViewById<TextView>(R.id.title0)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestviewHolder {
        val v=
      LayoutInflater.from(context).inflate(R.layout.rv_note_cell,parent,false)
        return RestviewHolder(v)
    }

    override fun getItemCount(): Int {
       return restlist.size
    }

    override fun onBindViewHolder(holder: RestviewHolder, position: Int) {
          holder.address.text=restlist[position].address
          holder.title.text=restlist[position].title
          }

}