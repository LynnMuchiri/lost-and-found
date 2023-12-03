package com.example.lostandfound

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.lostandfound.databinding.ActivityHomeBinding
import com.example.lostandfound.databinding.ActivityItemsPostedBinding
import com.example.lostandfound.databinding.ActivityMainBinding

class ItemsPosted : AppCompatActivity() {


    private  var _binding: ActivityItemsPostedBinding?=null



    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_posted)



        _binding = ActivityItemsPostedBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val viewClaimButton = findViewById<Button>(R.id.view_claims)
    viewClaimButton.setOnClickListener{
        showPopupDialog()
    }



}
        private fun showPopupDialog() {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.dialogue_success)
            dialog.window?.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            val closeButton = dialog.findViewById<ImageView>(R.id.closeButton)
            closeButton.setOnClickListener { dialog.dismiss() }

            dialog.show()

        }

    }

