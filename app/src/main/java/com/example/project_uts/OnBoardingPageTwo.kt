package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnBoardingPageTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_boarding_page_two)
        val name = findViewById<EditText>(R.id.name_input).text
        val btnStart = findViewById<Button>(R.id.btn_get_started)
        btnStart.setOnClickListener { // Intent to navigate to com.example.project_uts.OnBoardingPageOne
            val intent = Intent(
                this@OnBoardingPageTwo,
                QuizPageOne::class.java
            )
            intent.putExtra("name", name.toString())
            startActivity(intent)
        }
    }
}