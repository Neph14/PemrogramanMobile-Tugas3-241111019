package com.example.tugas3

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvUser = findViewById<TextView>(R.id.tvDisplayUsername)

        // Menerima data dari intent
        val username = intent.getStringExtra("EXTRA_USERNAME")
        tvUser.text = username
    }
}