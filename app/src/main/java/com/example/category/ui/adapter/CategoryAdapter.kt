package com.example.category.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.category.data.source.remote.CategoryResponse
import com.example.category.databinding.ItemCategoryBinding

class CategoryAdapter : RecyclerView.Adapter<MainHolder>() {
    var categories = mutableListOf<CategoryResponse>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCategoryBinding.inflate(inflater, parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val category = categories[position]
        holder.binding.name.text = category.name
        Glide
            .with(holder.itemView.context)
            .load(category.image)
            .into(holder.binding.image)
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}

class MainHolder(val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root)