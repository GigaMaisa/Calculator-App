package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var isPlus : Boolean = false
    private var isMinus : Boolean = false
    private var isDivide : Boolean = false
    private var isMultiply : Boolean = false
    private var numberOne : Float = 0.0f
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.numberEditText)
    }
    fun operationFunction(view: View) {

        when (view.id) {
            R.id.buttonOne -> {
                val number = editText.text.toString() + "1"
                editText.setText(number)
            }
            R.id.buttonTwo -> {
                val number = editText.text.toString() + "2"
                editText.setText(number)
            }
            R.id.buttonThree -> {
                val number = editText.text.toString() + "3"
                editText.setText(number)
            }
            R.id.buttonFour -> {
                val number = editText.text.toString() + "4"
                editText.setText(number)
            }
            R.id.buttonFive -> {
                val number = editText.text.toString() + "5"
                editText.setText(number)
            }
            R.id.buttonSix -> {
                val number = editText.text.toString() + "6"
                editText.setText(number)
            }
            R.id.buttonSeven -> {
                val number = editText.text.toString() + "7"
                editText.setText(number)
            }
            R.id.buttonEight -> {
                val number = editText.text.toString() + "8"
                editText.setText(number)
            }
            R.id.buttonNine -> {
                val number = editText.text.toString() + "9"
                editText.setText(number)
            }
            R.id.buttonPoint -> {
                val number = editText.text.toString() + "."
                editText.setText(number)
            }
            R.id.buttonZero -> {
                val number = editText.text.toString() + "0"
                editText.setText(number)
            }
            R.id.buttonDeleteAll -> {
                editText.setText(null)
            }
            R.id.buttonPlus ->{
                numberOne = editText.text.toString().toFloat()
                editText.setText(null)
                isPlus = true
            }
            R.id.buttonMinus -> {
                numberOne = editText.text.toString().toFloat()
                editText.setText(null)
                isMinus = true
            }
            R.id.buttonDivision -> {
                numberOne = editText.text.toString().toFloat()
                editText.setText(null)
                isDivide = true
            }
            R.id.buttonMultiplication ->{
                numberOne = editText.text.toString().toFloat()
                editText.setText(null)
                isMultiply = true
            }
            R.id.buttonEquals -> {
                if (isPlus) {
                    val numberTwo = editText.text.toString().toFloat()
                    val result = numberOne + numberTwo
                    editText.setText(result.toString())
                    isPlus = false
                }
                else if (isMinus) {
                    val numberTwo = editText.text.toString().toFloat()
                    val result = numberOne - numberTwo
                    editText.setText(result.toString())
                    isMinus = false
                }
                else if (isDivide) {
                    val numberTwo = editText.text.toString().toFloat()
                    val result = numberOne / numberTwo
                    editText.setText(result.toString())
                    isDivide = false
                }
                else if (isMultiply) {
                    val numberTwo = editText.text.toString().toFloat()
                    val result = numberOne * numberTwo
                    editText.setText(result.toString())
                    isMultiply = false
                }
                else {
                    Toast.makeText(this,"Please, fill the operations", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}