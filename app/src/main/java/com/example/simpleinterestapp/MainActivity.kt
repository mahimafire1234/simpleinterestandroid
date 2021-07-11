package com.example.simpleinterestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    declaring variables
    private lateinit var etresult:TextView
    private lateinit var etamount:EditText
    private lateinit var etrate:EditText
    private lateinit var ettime:EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etamount=findViewById(R.id.etamount)
        etrate=findViewById(R.id.etrate)
        ettime=findViewById(R.id.ettime)
        button=findViewById(R.id.button)
        etresult=findViewById(R.id.tvresult)

        button.setOnClickListener { si() }
    }

    private fun si(){
        val amount=etamount.text.toString().toFloat()
        val rate=etrate.text.toString().toFloat()
        val time=ettime.text.toString().toFloat()
        val result=(amount*time*rate)/100
        etresult.text=result.toString()
        Toast.makeText(this@MainActivity,"SI is $result",Toast.LENGTH_SHORT).show();

    }
}