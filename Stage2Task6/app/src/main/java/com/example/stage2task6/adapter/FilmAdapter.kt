package com.example.stage2task6.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stage2task6.R
import com.example.stage2task6.data.local.model.Film

class FilmAdapter : RecyclerView.Adapter<FilmViewHolder>() {
    private var items = listOf<Film>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.film_info_item, null)
        return FilmViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.bind(items[holder.adapterPosition])
    }

    fun setList(items: List<Film>) {
        this.items = items
        notifyDataSetChanged()
    }
}
