package com.ib.onemoremvvmtaskfromvova.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.LinearLayoutManager
import com.ib.onemoremvvmtaskfromvova.DataModel
import com.ib.onemoremvvmtaskfromvova.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    private val dataModel: DataModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)
        binding.rvListOfNames.layoutManager = LinearLayoutManager(this.activity)
        dataModel.kids.observe(this.activity as LifecycleOwner) { listOfKids ->
            binding.rvListOfNames.layoutManager = LinearLayoutManager(context)
            binding.rvListOfNames.adapter = MainAdapter(listOfKids)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClickButton()
    }

    private fun onClickButton() {
        binding.bEnter.setOnClickListener {
            dataModel.getKids()
        }
    }

}