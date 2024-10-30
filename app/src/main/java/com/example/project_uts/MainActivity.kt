package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_finish_page)

        val name = intent.getStringExtra("name")

        var totalScore = 0

        for (i in 1..5) {
            val userAnswer = intent.getStringExtra("ANSWER_RESULT_$i")

            // Cek apakah jawaban benar
            if (userAnswer == "Correct Answer!") {
                totalScore += 20 // Tambah 20 poin untuk setiap jawaban benar
            }

        }
        val tvNilai: Button = findViewById(R.id.tv_nilai)
        val tvName: TextView = findViewById(R.id.tv_nama)
        val btFinish: Button = findViewById(R.id.bt_finish)


        // Set nilai skor ke Button tv_nilai
        tvNilai.text = totalScore.toString()
        tvName.text = name.toString()

        // Set click listener untuk tombol finish (opsional)
        btFinish.setOnClickListener {
            Toast.makeText(this, "Selesai! Skor Anda: $totalScore", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, OnBoardingPageOne::class.java)
            startActivity(intent)
            finish() // Menutup activity
        }
    }
    }
