package com.example.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.databinding.RvItemBinding

class Adapter (var dataList : ArrayList<Model>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {
    inner class MyViewHolder(var binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding : RvItemBinding = RvItemBinding.inflate(
            LayoutInflater.from(parent.context), parent , false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.imageView.setImageResource(dataList[position].tumbnaleImage)
        holder.binding.chanelLogo.setImageResource(dataList[position].chanelLogo)
        holder.binding.title.text = dataList[position].title
    }
}