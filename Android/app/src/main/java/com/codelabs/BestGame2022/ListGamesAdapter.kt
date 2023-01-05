package com.codelabs.BestGame2022

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codelabs.BestGame2022.databinding.ItemRowGameBinding



    class ListGameAdapter (private val list : ArrayList<Games>)  :
    RecyclerView.Adapter<ListGameAdapter.ListViewHolder>() {
    inner class ListViewHolder (private val binding : ItemRowGameBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(games: Games){
            with(binding){
                tvGamesName.text = games.name
                tvDetailGame.text = games.detail
                Glide.with(itemView.context)
                    .load(games.photo)
                    .apply(RequestOptions().override(260, 260))
                    .into(ivGame)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DETAIL,games)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
            val binding = ItemRowGameBinding.inflate((LayoutInflater.from(parent.context)), parent, false)
            return ListViewHolder(binding)
        }
        override fun onBindViewHolder(holder: ListViewHolder, position: Int){
            val data = list[position]
            
            holder.bind(data)
        }

        override fun getItemCount(): Int {
            return list.size
        }
    }