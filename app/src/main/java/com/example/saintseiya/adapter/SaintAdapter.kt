package com.example.saintseiya.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.saintseiya.data.Saint
import com.example.saintseiya.databinding.ItemlistsaintBinding
import com.squareup.picasso.Picasso

class SaintAdapter(private val listSaint : List<Saint>, val selectSaint: (Saint) -> Unit) : RecyclerView.Adapter<SaintAdapter.SaintViewHolder>() {
    class SaintViewHolder (val binding: ItemlistsaintBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SaintViewHolder {
        val bindingSaint = ItemlistsaintBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SaintViewHolder(bindingSaint)
    }

    override fun getItemCount(): Int = listSaint.size


    override fun onBindViewHolder(holder: SaintViewHolder, position: Int) {
        val item = listSaint[position]
        holder.binding.name.text = item.name
        holder.binding.Constellation.text = item.constellation
        holder.binding.ArmorType.text = item.armorType
        Picasso.get()
            .load(item.miniLogoPhoto)
            .into(holder.binding.itemPhoto)

        holder.binding.btnSelect.setOnClickListener {
            selectSaint(item)
        }
    }
}