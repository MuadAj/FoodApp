package com.example.foodapp.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.foodapp.*
//import com.example.foodapp.FoodListDirections
import com.example.foodapp.databinding.FragmentFoodListBinding
import com.example.foodapp.modal.SharePref

class FoodList : Fragment(R.layout.fragment_food_list) {

    private var _binding: FragmentFoodListBinding? = null
    private val binding get() = _binding!!
    private val viewModal by viewModels<FoodViewModal>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFoodListBinding.bind(view)
        val adapter = FoodLisAdapter(SharePref(requireContext())) {
            val action = FoodListDirections.actionListFoodToDetailesF(it.name, it.imageUrl)
            view.findNavController().navigate(action)
        }


        binding.rvFood.adapter = adapter

        viewModal.foodList.observe(viewLifecycleOwner){list ->
            adapter.submitList(list)
        }

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}