package com.example.foodapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.foodapp.databinding.FragmentSettingsBinding


class Settings : Fragment(R.layout.fragment_settings) {


    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)

//        Toast.makeText(requireContext(),"Setting", Toast.LENGTH_LONG).show()

        val ShareP = SharePref(requireContext())
        binding.btnsave.setOnClickListener {

            if(binding.rdlarge.isChecked) {
                val l = 52F
                ShareP.saveFontSize(l)
            }else if(binding.rdmedium.isChecked){
                val m = 22f
                ShareP.saveFontSize(m)
            }else{
                val s = 12f
                ShareP.saveFontSize(s)
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}