package com.example.praktikump2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenLayoutPractice: Button = findViewById(R.id.btnOpenLayoutPractice)
        btnOpenLayoutPractice.setOnClickListener {
            val intent = Intent(this, LayoutPracticeActivity::class.java)
            startActivity(intent)
        }
    }
}