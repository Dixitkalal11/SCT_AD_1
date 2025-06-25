package com.internship.calculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val resultText = findViewById<TextView>(R.id.resultText)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val subBtn = findViewById<Button>(R.id.subBtn)
        val mulBtn = findViewById<Button>(R.id.mulBtn)
        val divBtn = findViewById<Button>(R.id.divBtn)

        addBtn.setOnClickListener {
            val res = num1.text.toString().toDouble() + num2.text.toString().toDouble()
            resultText.text = "Result: $res"
        }

        subBtn.setOnClickListener {
            val res = num1.text.toString().toDouble() - num2.text.toString().toDouble()
            resultText.text = "Result: $res"
        }

        mulBtn.setOnClickListener {
            val res = num1.text.toString().toDouble() * num2.text.toString().toDouble()
            resultText.text = "Result: $res"
        }

        divBtn.setOnClickListener {
            val n2 = num2.text.toString().toDouble()
            if (n2 != 0.0) {
                val res = num1.text.toString().toDouble() / n2
                resultText.text = "Result: $res"
            } else {
                resultText.text = "Error: Divide by Zero"
            }
        }
    }
}
