package com.example.foodapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import coil.load
//import com.example.foodapp.DetailesFArgs
import com.example.foodapp.R
import com.example.foodapp.databinding.FragmentDetailesBinding


class DetailesF : Fragment(R.layout.fragment_detailes) {

    private var _binding: FragmentDetailesBinding? = null
    private val binding get() = _binding!!
    private val arg by navArgs<DetailesFArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDetailesBinding.bind(view)

        binding.tvDetailes.text = arg.name
        binding.imgshow.load(arg.imageUrl)



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }

}