package com.example.guessingnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guessingnumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var randomNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        randomNumber = createRandomNumber()
        checkAnswerButton()
    }

    private fun createRandomNumber(): Int {

        return (1..50).random()
    }

    private fun checkAnswerButton() {
        binding.sendButton.setOnClickListener {
            checkNumberInput()
        }
    }

    fun checkNumberInput() {
        val numberChosen = binding.editTextNumber.text
        val hint = binding.hintText
        if (numberChosen.isNotEmpty()) {
            checkAnswer()
        } else {
            hint.setTextColor(resources.getColor(R.color.design_default_color_error))
            hint.text = getString(R.string.empty_field)
        }
    }

    fun checkAnswer() {
        val numberChosen = binding.editTextNumber.text
        val hint = binding.hintText

        val numberChosenParsedValue = Integer.parseInt(numberChosen.toString())

        when {
            numberChosenParsedValue < randomNumber -> {
                hint.text = resources.getString(R.string.too_low)
            }
            numberChosenParsedValue > randomNumber -> {
                hint.text = resources.getString(R.string.too_high)
            }
            else -> {
                hint.setTextColor(resources.getColor(R.color.teal_200))
                hint.text = resources.getString(R.string.congratulations)
            }
        }
    }
}