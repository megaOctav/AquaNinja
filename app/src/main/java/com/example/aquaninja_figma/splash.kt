package com.example.aquaninja_figma

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.widget.Button
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonStart = findViewById<Button>(R.id.buttonNext)
        buttonStart.setOnClickListener { // Berpindah ke Login Screen
            val intent: Intent =
                Intent(
                    this@splash,
                    register::class.java
                )
            startActivity(intent)
            finish()
        }
    }
}
