package com.example.json_second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MarsAdapter(var listMarsPhotos: List<MarsPhoto>) :RecyclerView.Adapter<MarsAdapter.MarsViewHolder>() {

    class MarsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var textView:TextView = itemView.findViewById(R.id.tvRowitem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsViewHolder {
        var rowPlank = LayoutInflater.from(parent.context).inflate(R.layout.row_recyclerview,parent,false)
        return  MarsViewHolder(rowPlank)
    }

    override fun getItemCount(): Int {
        return listMarsPhotos.size
    }

    override fun onBindViewHolder(holder: MarsViewHolder, position: Int) {
        holder.textView.setText(listMarsPhotos.get(position).imgSrc)

    }
}