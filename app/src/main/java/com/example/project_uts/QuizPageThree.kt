package com.example.project_uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizPageThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_page_three)

        val btnOpsiPertama: Button = findViewById(R.id.btn_opsi_pertama)
        val btnOpsiKedua: Button = findViewById(R.id.btn_opsi_kedua)
        val btnOpsiKetiga: Button = findViewById(R.id.btn_opsi_ketiga) // Correct Answer
        val btnOpsiKeempat: Button = findViewById(R.id.btn_opsi_keempat)
        val btnNext: Button = findViewById(R.id.btn_next)

        // Set listeners for each button
        btnOpsiPertama.setOnClickListener { sendAnswer("Wrong Answer!") }
        btnOpsiKedua.setOnClickListener { sendAnswer("Wrong Answer!") }
        btnOpsiKetiga.setOnClickListener { sendAnswer("Correct Answer!") } // Correct Option
        btnOpsiKeempat.setOnClickListener { sendAnswer("Wrong Answer!") }
        btnNext.setOnClickListener { sendAnswer("Wrong Answer!") }

    }
    private fun sendAnswer(answer: String) {
        val answerResult1 = intent.getStringExtra("ANSWER_RESULT_1")
        val answerResult2 = intent.getStringExtra("ANSWER_RESULT_2")
        val name = intent.getStringExtra("name")

        val intent = Intent(this, QuizPageFour::class.java)
        intent.putExtra("ANSWER_RESULT_1", answerResult1)
        intent.putExtra("ANSWER_RESULT_2", answerResult2)
        intent.putExtra("ANSWER_RESULT_3", answer)
        intent.putExtra("name",name)
        startActivity(intent)
    }
}