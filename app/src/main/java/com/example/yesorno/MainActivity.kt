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
        binding.elevatedButtonDecide.setOnClickListener { getYesOrNo() }

    }
    private fun getYesOrNo() {
        showToast()

        val decision = (1..2).random()
        val decisionStyle = (1..3).random()
        if (decision == 1) {
            if (decisionStyle == 1) {
                binding.textViewDecision.text = "YES"
            } else if (decisionStyle == 2) {
                binding.textViewDecision.text = "YES!"
            } else {
                binding.textViewDecision.text = "YES."
            }
        } else {
            if (decisionStyle == 1) {
                binding.textViewDecision.text = "NO"
            } else if (decisionStyle == 2) {
                binding.textViewDecision.text = "NO!"
            } else {
                binding.textViewDecision.text = "NO."
            }
        }
    }
    private fun showToast() {
        val toastText = "Decision Made"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, toastText,duration)
        toast.show()
    }
}