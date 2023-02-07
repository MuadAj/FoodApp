package com.example.foodapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.content.ContentProviderCompat
import com.example.foodapp.databinding.FragmentFoodListBinding


class FoodList : Fragment(R.layout.fragment_food_list) {

    private var _binding: FragmentFoodListBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFoodListBinding.bind(view)
//        Toast.makeText(requireContext(),"Food", Toast.LENGTH_LONG).show()
        val adapter = FoodLisAdapter()
        binding.rvFood.adapter = adapter

        val nameList = mutableListOf(
            ListF("سمك مشوي ",R.drawable.images),
            ListF("أرز",R.drawable.rice),
            ListF("بيتزا",R.drawable.pizza),
            ListF("برجر لحم",R.drawable.birger),
            ListF("برجر دجاج",R.drawable.chekin),
            ListF("دجاج مشوي",R.drawable.chek2),
            ListF("دجاج محمر",R.drawable.chek),
            ListF("شاورما دجاج",R.drawable.fb_img_1675773444227),
            ListF("شاورما لحم",R.drawable.fb_img_1675773474081_edit_153938328478072),
            ListF("سكالوب دجاج",R.drawable.scalob),
            ListF("ساندوتش مفروم",R.drawable.fb_img_1675773601684_edit_153963050064006),
            ListF("ساندوتش تن",R.drawable.fb_img_1675773583328),
            ListF("ساندوتش كبدة",R.drawable.fb_img_1675773335953),
        )
        adapter.submitList(nameList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}