package com.game.gamemart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.game.gamemart.R
import com.game.gamemart.model.GameListModel

class GameListAdapter(private val games: List<GameListModel>) :
    RecyclerView.Adapter<GameListAdapter.GameViewHolder>() {

    class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title_game_list)
        val amount: TextView = itemView.findViewById(R.id.amount_game_list)
        val desc1: TextView = itemView.findViewById(R.id.detail_1_game_list)
        val desc2: TextView = itemView.findViewById(R.id.detail_2_game_list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.game_list_item, parent, false)
        return GameViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val currentGame = games[position]

        holder.title.text = currentGame.name
        holder.amount.text = currentGame.price
        holder.desc1.text = currentGame.description
        holder.desc2.text = currentGame.description

    }

    override fun getItemCount(): Int {
        return games.size
    }
}
