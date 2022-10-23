package com.example.mandoor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.core.view.WindowCompat

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        val backbuttonleft = findViewById<Button>(R.id.buttonback)
        val butonReg  = findViewById<Button>(R.id.buttonreg)

        backbuttonleft.setOnClickListener{
            val intent = Intent(this@Register, loginActivity::class.java)
            startActivity(intent)
        }
        butonReg.setOnClickListener{
            val intent = Intent(this@Register, loginActivity::class.java)
            startActivity(intent)
        }


    }
}