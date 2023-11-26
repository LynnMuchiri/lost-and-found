package com.example.lostandfound

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lostandfound.databinding.ActivitySignupBinding

class SignupActivity : Fragment() {

    private var _binding: ActivitySignupBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ActivitySignupBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.signin.setOnClickListener {
            findNavController().navigate(R.id.action_Signup_to_Login)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}