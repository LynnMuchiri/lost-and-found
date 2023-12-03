package com.example.lostandfound

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.lostandfound.databinding.ActivityLoginBinding
import com.example.lostandfound.databinding.FragmentItemsFoundBinding
import com.google.android.material.textfield.TextInputEditText
import java.util.Locale



class ItemsFound : Fragment() {

    private var _binding: FragmentItemsFoundBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentItemsFoundBinding.inflate(inflater, container, false)

        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.pickDate.setOnClickListener { showDatePickerDialog() }
        binding.pickTime1.setOnClickListener {
            setupTimePicker(binding.pickTime1)
        }
        binding.pickTime2.setOnClickListener {
            setupTimePicker(binding.pickTime2)
        }

        // Setup listeners for time pickers
        binding.SubmitItem.setOnClickListener { showPopupDialog()
        findNavController().navigate(R.id.HomeActivity)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showDatePickerDialog() {
        // Use the current date as the default date in the picker
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        // Create a new instance of DatePickerDialog and return it
        val datePickerDialog =
            DatePickerDialog(requireContext(), { _, selectedYear, selectedMonth, selectedDay ->
                // The callback received when the user "sets" the date in the dialog

                binding.pickDate.setText(
                    String.format(
                        Locale.getDefault(),
                        "%d-%d-%d",
                        selectedYear,
                        selectedMonth + 1,
                        selectedDay
                    )
                )
            }, year, month, day)


        datePickerDialog.show()
    }


    private fun setupTimePicker(textInputEditText: TextInputEditText) {
        textInputEditText.setOnClickListener {
            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)

            val timePickerDialog = TimePickerDialog(
                requireContext(),
                { _, selectedHour, selectedMinute ->
                    // Format the selected time and set it to the TextInputEditText
                    textInputEditText.setText(
                        String.format(
                            Locale.getDefault(),
                            "%02d:%02d",
                            selectedHour,
                            selectedMinute
                        )
                    )
                },
                hour, minute, true // 'true' to use 24-hour format
            )

            timePickerDialog.show()
        }
    }


    private fun showPopupDialog() {
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.dialogue_confirmed)
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




