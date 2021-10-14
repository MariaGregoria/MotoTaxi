package com.example.mototaxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    lateinit var btn_registrar: Button
    lateinit var btn_login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_registrar = findViewById(R.id.btn_registrarLog)
        btn_login = findViewById(R.id.btn_loginLog)

        btn_registrar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {}
            startActivity(intent)
        }

        btn_login.setOnClickListener {
            val intent = Intent(this, TarifasActivity::class.java).apply {}
            startActivity(intent)
        }

    }


}