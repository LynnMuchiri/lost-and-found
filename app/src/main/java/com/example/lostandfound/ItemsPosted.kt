package com.example.lostandfound

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class ItemsPosted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_posted)


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

