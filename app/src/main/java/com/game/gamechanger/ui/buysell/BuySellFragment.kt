package com.game.gamechanger.ui.buysell

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.game.gamechanger.R
import com.game.gamechanger.databinding.FragmentDashboardBinding

class BuySellFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val categorySpinner: Spinner = root.findViewById(R.id.categorySpinner)

        // Create an ArrayAdapter using the string array and a default spinner layout
        val adapter: ArrayAdapter<CharSequence> = context?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.category_array,
                android.R.layout.simple_spinner_item
            )
        } as ArrayAdapter<CharSequence>

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        categorySpinner.adapter = adapter





        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}