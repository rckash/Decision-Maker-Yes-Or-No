package com.example.yesorno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.yesorno.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //button functionality
        binding.button.setOnClickListener { getYesOrNo() }
    }
    private fun getYesOrNo() {
        showToast()

        var decision = (1..2).random()
        if (decision == 1) {
            binding.textView.text = "YES"
        } else {
            binding.textView.text = "NO"
        }
    }
    private fun showToast() {
        val toastText = "Decision Made"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, toastText,duration)
        toast.show()
    }
}