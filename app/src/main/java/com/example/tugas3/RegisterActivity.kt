package com.example.tugas3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etUser = findViewById<EditText>(R.id.etUsernameReg)
        val etPass = findViewById<EditText>(R.id.etPasswordReg)
        val etConfirm = findViewById<EditText>(R.id.etConfirmPasswordReg)
        val btnSave = findViewById<Button>(R.id.btnRegister)

        btnSave.setOnClickListener {
            val user = etUser.text.toString()
            val pass = etPass.text.toString()
            val confirm = etConfirm.text.toString()

            if (user.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show()
            } else if (pass != confirm) {
                Toast.makeText(this, "Password tidak cocok", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show()
                finish() // Kembali ke activity sebelumnya (Login)
            }
        }
    }
}