package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            addBtn.setOnClickListener {
                tvResult.text = Math().add(etFirst.text.toString(), etSecond.text.toString())
            }
            divideBtn.setOnClickListener {
                tvResult.text = Math().divide(etFirst.text.toString(), etSecond.text.toString())
            }
        }
    }
}