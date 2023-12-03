package com.example.lostandfound

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lostandfound.databinding.FragmentFoundItemsBinding
import androidx.navigation.fragment.findNavController
class FoundItemsFragment : Fragment() {

    private var _binding: FragmentFoundItemsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFoundItemsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.BtnClaim1.setOnClickListener {
            findNavController().navigate(R.id.action_FoundItems_to_ClaimForm)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}