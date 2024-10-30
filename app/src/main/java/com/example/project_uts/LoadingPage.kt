// com.example.project_uts.LoadingPage.java
package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoadingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_page)

        val btnStart = findViewById<Button>(R.id.btn_start)
        btnStart.setOnClickListener { // Intent to navigate to com.example.project_uts.OnBoardingPageOne
            val intent = Intent(
                this@LoadingPage,
                OnBoardingPageOne::class.java
            )
            startActivity(intent)
        }
    }
}