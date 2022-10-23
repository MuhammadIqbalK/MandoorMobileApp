package com.example.mandoor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.WindowCompat

class ResetPassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        supportActionBar?.hide()
        setContentView(R.layout.activity_reset_pass)

        val backbtnleft = findViewById<Button>(R.id.btnbackLogin)
        val Regbuton  = findViewById<Button>(R.id.buttonreg2)

        backbtnleft.setOnClickListener{
            val intent = Intent(this@ResetPassActivity, loginActivity::class.java)
            startActivity(intent)
        }
        Regbuton.setOnClickListener{
            val intent = Intent(this@ResetPassActivity, loginActivity::class.java)
            startActivity(intent)
        }

    }
}