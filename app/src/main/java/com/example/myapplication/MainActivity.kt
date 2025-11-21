package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val questions = findViewById<TextView>(R.id.question)
        val answers_1 = findViewById<TextView>(R.id.answer)
        val answers_2 = findViewById<TextView>(R.id.answer2)
        val answers_3    = findViewById<TextView>(R.id.answer3)

        answers_1.setOnClickListener {
            answers_1.setBackgroundColor(getResources().getColor(R.color.Rouge, null))
            answers_2.setBackgroundColor(getResources().getColor(R.color.Vert, null))
        }

        answers_2.setOnClickListener {
            answers_2.setBackgroundColor(getResources().getColor(R.color.Vert, null))
        }

        answers_3.setOnClickListener {
            answers_3.setBackgroundColor(getResources().getColor(R.color.Rouge, null))
            answers_2.setBackgroundColor(getResources().getColor(R.color.Vert, null))
        }

   }
}