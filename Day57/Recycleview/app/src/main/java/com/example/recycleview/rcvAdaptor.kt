package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class rcvAdaptor(
    val requiredContext: Context,
    private val personDetails: ArrayList<personDetails>
) : RecyclerView.Adapter<rcvAdaptor.personViewHolder>() {
    class personViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val personName: TextView = itemView.findViewById(R.id.textView)
        val personNumber: TextView = itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): personViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.rcv_items,parent,false)
        return personViewHolder(view)
    }

    override fun getItemCount(): Int {
        return personDetails.size
    }

    override fun onBindViewHolder(holder: personViewHolder, position: Int) {
        holder.personName.text=personDetails[position].personName
        holder.personNumber.text=personDetails[position].personNumber
    }
}