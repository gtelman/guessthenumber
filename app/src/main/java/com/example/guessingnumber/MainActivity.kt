package com.example.guessingnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guessingnumber.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        checkAnswer()
    }

    private fun createRandom(): Int {
        binding.newGameButton.setOnClickListener {
            randomNumber()
        }
        return randomNumber()
    }

    private fun checkAnswer() {
        val randomNumber: Int = createRandom()
        binding.sendButton.setOnClickListener {
            val numberChosen = binding.editTextNumber.text
            val numberChosenParsedValue = Integer.parseInt(numberChosen.toString())

            when {
                numberChosenParsedValue < randomNumber -> {
                    binding.hintText.text = resources.getString(R.string.too_low)
                }
                numberChosenParsedValue > randomNumber -> {
                    binding.hintText.text = resources.getString(R.string.too_high)
                }
                else -> {
                    binding.hintText.text = resources.getString(R.string.congratulations)
                }
            }
        }
    }

    private fun randomNumber(): Int {

        return (1..50).random()
    }
}