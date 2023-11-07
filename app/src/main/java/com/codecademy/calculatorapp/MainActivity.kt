
package com.codecademy.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.codecademy.calculatorapp.R.id.addButton
import com.codecademy.calculatorapp.R.id.numberFirst
import com.codecademy.calculatorapp.R.id.numberSecond
import com.codecademy.calculatorapp.R.id.resultView
import com.codecademy.calculatorapp.R.layout.activity_main

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Onclick on addition button
        val addButton = findViewById<Button>(R.id.addButton) // Button element with ID addButton
        addButton.setOnClickListener {
            addition()
        }
        //Onclick on subtraction button
        val subButton = findViewById<Button>(R.id.subButton)
        subButton.setOnClickListener {
            subtraction()
        }
        //Onclick on multiplication button
        val multiButton = findViewById<Button>(R.id.multiButton)
        multiButton.setOnClickListener {
            multiplication()
        }
        //Onclick on division button
        val divButton = findViewById<Button>(R.id.divButton)
        divButton.setOnClickListener {
            division()
        }
    }
    //For addition
    fun addition() {
        val num1Text = findViewById<EditText>(R.id.numberFirst).text.toString() // EditText with ID numberFirst
        val num2Text = findViewById<EditText>(R.id.numberSecond).text.toString() // EditText with ID numberSecond
        val resultView = findViewById<TextView>(R.id.resultView) // TextView with ID resultView

        if (num1Text.isEmpty() || num2Text.isEmpty()) {
            resultView.text = "Please enter valid numbers"
            return
        }

        val num1 = num1Text.toInt()
        val num2 = num2Text.toInt()
        val addSum = num1 + num2

        resultView.text = "Result: $addSum"
    }
    //For subtraction
    fun subtraction(){
        val num1Text = findViewById<EditText>(R.id.numberFirst).text.toString()
        val num2Text = findViewById<EditText>(R.id.numberSecond).text.toString()
        val resultView = findViewById<TextView>(R.id.resultView)

        val num1 = num1Text.toInt()
        val num2 = num2Text.toInt()
        val subSum = num1 - num2
        resultView.text = "Result: $subSum"
    }
    //For multiplication
    fun multiplication(){
        val num1Text = findViewById<EditText>(R.id.numberFirst).text.toString()
        val num2Text = findViewById<EditText>(R.id.numberSecond).text.toString()
        val resultView = findViewById<TextView>(R.id.resultView)

        val num1 = num1Text.toInt()
        val num2 = num2Text.toInt()
        val multiSum = num1 * num2
        resultView.text = "Result: $multiSum"
    }
    //For division
    fun division(){
        val num1Text = findViewById<EditText>(R.id.numberFirst).text.toString()
        val num2Text = findViewById<EditText>(R.id.numberSecond).text.toString()
        val resultView = findViewById<TextView>(R.id.resultView)

        val num1 = num1Text.toInt()
        val num2 = num2Text.toInt()
        val divSum = num1 / num2
        resultView.text = "Result: $divSum"
    }

}