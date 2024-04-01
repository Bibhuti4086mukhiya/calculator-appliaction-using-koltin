package com.np.calculatorapp

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivsion: Button
    lateinit var valueA: EditText
    lateinit var valueB: EditText
    lateinit var resultTv : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_sub)
        btnMultiply = findViewById(R.id.btn_multiply)
        btnDivsion = findViewById(R.id.btn_division)
        valueA = findViewById(R.id.input_a)
        valueB = findViewById(R.id.input_b)
        resultTv = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivsion.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = valueA.text.toString().toDouble()
        var b = valueB.text.toString().toDouble()
        var result=0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_sub ->{
                result = a-b
            }
            R.id.btn_multiply ->{
                result = a*b
            } R.id.btn_division ->{
                result = a/b
            }
        }
        resultTv.text="result is $result"
    }

}