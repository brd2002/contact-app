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
        var model = dataList.get(position)
        holder.binding.imageView.setImageResource(model.tumbnaleImage)
        holder.binding.chanelLogo.setImageResource(model.chanelLogo)
        holder.binding.title.text = model.title
    }
}