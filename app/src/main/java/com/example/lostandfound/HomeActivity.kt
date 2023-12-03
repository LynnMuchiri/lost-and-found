package com.example.lostandfound

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lostandfound.databinding.ActivityHomeBinding
import com.google.android.material.snackbar.Snackbar

class HomeActivity : Fragment() {

    private var _binding: ActivityHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ActivityHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.notifications.setOnClickListener { view ->
            Snackbar.make(view, "No new notifications", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        binding.postItemFound.setOnClickListener{
            findNavController().navigate(R.id.action_home_to_ItemsFound)
        }

        binding.MyItems.setOnClickListener{
            findNavController().navigate(R.id.action_home_to_Itemsposted)

        }

        binding.logout.setOnClickListener { view ->
            Snackbar.make(view, "Logging out", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            findNavController().navigate(R.id.action_home_to_login)
        }

        binding.findItemBtn.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_category)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}