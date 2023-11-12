package com.game.gamechanger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.game.gamechanger.Model.GameListModel

class GameListAdapter(private val games: List<GameListModel>) :
    RecyclerView.Adapter<GameListAdapter.GameViewHolder>() {

    class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
        val genreTextView: TextView = itemView.findViewById(R.id.textViewGenre)
        // Add other views as needed
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.game_list_item, parent, false)
        return GameViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val currentGame = games[position]

        // Bind data to views
        holder.titleTextView.text = currentGame.title
        holder.genreTextView.text = currentGame.genre
        // Bind other data as needed
    }

    override fun getItemCount(): Int {
        return games.size
    }
}
