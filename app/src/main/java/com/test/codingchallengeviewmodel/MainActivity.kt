package com.test.codingchallengeviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.test.codingchallengeviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.btnAdd.setOnClickListener {
            if (!binding.etNumber.text.toString().isNullOrEmpty()){
                viewModel.addToResult(binding.etNumber.text.toString().toInt())
                binding.tvResult.text = viewModel.getResult().toString()
                binding.etNumber.text.clear()
            }
        }

    }
}