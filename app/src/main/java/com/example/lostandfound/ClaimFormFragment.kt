package com.example.lostandfound

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lostandfound.databinding.FragmentClaimFormBinding

class ClaimFormFragment : Fragment() {

    private var _binding: FragmentClaimFormBinding? = null
    private val binding get() = _binding!!
//    private lateinit var datePickerDialog: DatePickerDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentClaimFormBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.SubmitClaim.setOnClickListener {
            findNavController().navigate(R.id.action_ClaimForm_to_Home)
        }

//        binding.datelost.setOnClickListener{
//            DatePickerDialog datePickerDialog = new DatePickerDialog(this,this, 2023,3,3)
//        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    override fun onDateSet(p0: DatePicker?, year: Int, month: Int, date: Int) {
//        month+1
//
//        var dayStr: String = date.toString()
//        var monthStr = month.toString()
//
//        if (dayStr.length == 1) dayStr = "0$dayStr"
//
//        if (monthStr.length == 1) monthStr = "0$monthStr"
//
//        // dd/mm/yyyy format set.
//
//        // dd/mm/yyyy format set.
//        binding.datelost.setText("$dayStr/$monthStr/$year")
//
//    }


}