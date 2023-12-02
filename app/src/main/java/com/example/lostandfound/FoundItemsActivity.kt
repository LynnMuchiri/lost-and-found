package com.example.lostandfound

import android.app.DatePickerDialog
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.util.Locale

class FoundItemsActivity : AppCompatActivity() {


        private lateinit var editTextDate: EditText

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_found_items)

            editTextDate = findViewById(R.id.pick_date_found)
            editTextDate.setOnClickListener { showDatePickerDialog() }
        }

        private fun showDatePickerDialog() {
            // Use the current date as the default date in the picker
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            // Create a new instance of DatePickerDialog and return it
            val datePickerDialog = DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
                // The callback received when the user "sets" the date in the dialog
                editTextDate.setText(String.format(Locale.getDefault(), "%d-%d-%d", selectedYear, selectedMonth + 1, selectedDay))
            }, year, month, day)

            datePickerDialog.show()
        }
    }

