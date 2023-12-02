package com.example.lostandfound

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.example.lostandfound.databinding.FragmentBagsSubcategoryBinding

class BagsSubcategory : Fragment() {

    private var _binding: FragmentBagsSubcategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBagsSubcategoryBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.LaptopBags.setOnClickListener {
            findNavController().navigate(R.id.action_BagsSubCat_to_FoundItems)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}