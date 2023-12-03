package com.example.lostandfound

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lostandfound.databinding.ActivityLoginBinding
import com.example.lostandfound.databinding.FragmentPostedItems2Binding


class PostedItemsFragment2 : Fragment() {

    private var _binding: FragmentPostedItems2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentPostedItems2Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewClaims.setOnClickListener {
            findNavController().navigate(R.id.action_ItemsPosted_to_ClaimsList)
        }
        binding.viewClaims1.setOnClickListener {
            findNavController().navigate(R.id.action_ItemsPosted_to_ClaimsList)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}