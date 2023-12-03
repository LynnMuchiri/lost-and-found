package com.example.lostandfound

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.example.lostandfound.databinding.ActivityHomeBinding
import com.example.lostandfound.databinding.FragmentClaimInfoBinding

class claimInfoFragment : DialogFragment() {
    private var _binding: FragmentClaimInfoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentClaimInfoBinding.inflate(inflater, container, false)
        return binding.root


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_claim_info, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.approve.setOnClickListener {
            findNavController().navigate(R.id.action_claim_success)
        }
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_back_to_claims_list)
        }




    }


}