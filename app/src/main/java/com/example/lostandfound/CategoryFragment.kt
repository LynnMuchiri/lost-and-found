package com.example.lostandfound

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lostandfound.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Devices.setOnClickListener {
            findNavController().navigate(R.id.action_category_to_DeviceSubCat)
        }

        binding.Accessories.setOnClickListener {
            findNavController().navigate(R.id.action_category_to_AccessorySubCat)
        }

        binding.Clothing.setOnClickListener {
            findNavController().navigate(R.id.action_category_to_ClothingSubCat)
        }

        binding.IDs.setOnClickListener {
            findNavController().navigate(R.id.action_category_to_IdSubCat)
        }

        binding.Bags.setOnClickListener {
            findNavController().navigate(R.id.action_category_to_BagsSubCat)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}