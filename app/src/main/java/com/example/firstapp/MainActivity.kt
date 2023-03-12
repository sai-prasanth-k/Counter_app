package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMyTextView = findViewById<TextView>(R.id.textView)
        val btnclicked = findViewById<Button>(R.id.mybutton)
        var times = 0
        btnclicked.setOnClickListener{
            btnclicked.text = "haha you clicked me!"
            times += 1
            tvMyTextView.text = times.toString()

            Toast.makeText(this,"Hey I'm Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}