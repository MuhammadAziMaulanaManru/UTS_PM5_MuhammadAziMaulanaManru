package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnBoardingPageOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_boarding_page_one)
        val btnStart = findViewById<Button>(R.id.btn_get_started)
        btnStart.setOnClickListener { // Intent to navigate to com.example.project_uts.OnBoardingPageOne
            val intent = Intent(
                this@OnBoardingPageOne,
                OnBoardingPageTwo::class.java
            )
            startActivity(intent)
        }
    }
}