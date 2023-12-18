package com.game.gamemart.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.game.gamemart.adapter.GameListAdapter
import com.game.gamemart.databinding.FragmentHomeBinding
import com.game.gamemart.model.GameListModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    // Dummy data
    private val dummyGames = listOf(
        GameListModel("1", "", "Action","gaming experience with this top-tier","7000","BGMI Account"),
        GameListModel("2", "", "Game","Dive into the world of luxury with a fully upgraded","6541","BGMI Account for"),
        GameListModel("3", "", "Action","Revel in the glory of numerous unlocked achievements","32145","FF Account"),
        GameListModel("4", "", "Action","This account boasts an impressive level","589","VOLNT Account"),
    )

    private lateinit var gameListAdapter: GameListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Initialize RecyclerView and its adapter
        gameListAdapter = GameListAdapter(dummyGames)
        binding.homeRecyclerViewGames.adapter = gameListAdapter
        binding.homeRecyclerViewGames.layoutManager = LinearLayoutManager(context)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}