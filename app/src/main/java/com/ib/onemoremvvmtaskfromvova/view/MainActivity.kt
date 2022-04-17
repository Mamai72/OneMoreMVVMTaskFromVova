package com.ib.onemoremvvmtaskfromvova.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ib.onemoremvvmtaskfromvova.R
import com.ib.onemoremvvmtaskfromvova.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.place_holder, MainFragment())
            .commitNow()
    }


    }
