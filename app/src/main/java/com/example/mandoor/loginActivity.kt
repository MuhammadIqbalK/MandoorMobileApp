package com.example.mandoor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.WindowCompat

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login)

        val toRegisBtn = findViewById<Button>(R.id.btnSignup)
        val toResetpas = findViewById<TextView>(R.id.lupapass)

        toRegisBtn.setOnClickListener{
            val intent = Intent(this@loginActivity, Register::class.java)
            startActivity(intent)
        }
        toResetpas.setOnClickListener{
            val intent = Intent(this@loginActivity, ResetPassActivity::class.java)
            startActivity(intent)
        }


    }


}