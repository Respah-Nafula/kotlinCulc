package com.blessednafula.culculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnDivision: Button
    lateinit var btnModulus: Button
    lateinit var tilNumber: TextInputLayout
    lateinit var etNumber: TextInputEditText
    lateinit var tilNumba: TextInputLayout
    lateinit var etNumba: TextInputEditText
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNumber = findViewById(R.id.tilNumber)
        etNumber = findViewById(R.id.etNumber)
        tilNumba = findViewById(R.id.tilNumba)
        etNumba = findViewById(R.id.etNumba)
        tvResult = findViewById(R.id.tvResult)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnDivision = findViewById(R.id.btnDivision)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult.setOnClickListener {

        }
        btnAdd.setOnClickListener {
            var number1 = etNumber.text.toString().toInt()
            var number2 = etNumber.text.toString().toInt()
            Add(number1, number2)
        }
        btnSubtract.setOnClickListener {
            var number1 = etNumber.text.toString().toInt()
            var number2 = etNumba.text.toString().toInt()
            Subtract(number1, number2)

        }
        btnDivision.setOnClickListener {
            var number1 = etNumber.text.toString().toInt()
            var number2 = etNumba.text.toString().toInt()
            Division(number1, number2)
        }
        btnModulus.setOnClickListener {
            var number1 = etNumber.text.toString().toInt()
            var number2 = etNumba.text.toString().toInt()
            Modulus(number1, number2)
        }
    }
        fun Add(number1: Int,number2: Int){
            var Add=number1+number2
            tvResult.text=Add.toString()
        }

        fun Modulus(number1: Int, number2: Int) {
            var Modulus= number1%number2
            tvResult.text =Modulus.toString()
        }

        fun Subtract(number1: Int, number2: Int) {
            var Subtract= number1-number2
            tvResult.text =Subtract.toString()
        }

        fun Division(number1: Int, number2: Int) {
            var Division = number1/number2
            tvResult.text =Division.toString()
        }


    }

