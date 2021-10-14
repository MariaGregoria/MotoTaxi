package com.example.mototaxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn_registrar: Button
    lateinit var btn_login: Button
    lateinit var btn_trabajador: Button
    lateinit var btn_cliente: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login = findViewById(R.id.btn_login)

        btn_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java).apply {}
            startActivity(intent)
        }
    }

}
