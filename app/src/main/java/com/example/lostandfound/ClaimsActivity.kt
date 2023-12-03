package com.example.lostandfound

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lostandfound.databinding.FragmentClaimSuccessBinding
import com.example.lostandfound.databinding.FragmentClaimsActivityBinding
import com.example.lostandfound.databinding.ItemsListBinding


class ClaimsActivity : Fragment() {
    private var _binding: FragmentClaimsActivityBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        _binding = FragmentClaimsActivityBinding.inflate(inflater, container, false)
        return binding.root
        //return inflater.inflate(R.layout.fragment_claims_activity, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // getting the employeelist
        val employelist=Constants.getEmployeeData()
        // Assign employeelist to ItemAdapter
        val itemAdapter=Adapter(employelist)
        // Set the LayoutManager that
        // this RecyclerView will use.
        val recyclerView: RecyclerView =view.findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        // adapter instance is set to the
        // recyclerview to inflate the items.
        recyclerView.adapter = itemAdapter
        binding.singleClaim.setOnClickListener {
            findNavController().navigate(R.id.action_go_to_claim_info)
        }


    }


}