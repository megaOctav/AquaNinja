package com.example.aquaninja_figma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class target : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_target)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonStart = findViewById<Button>(R.id.btnAdd)
        buttonStart.setOnClickListener {
            // Pastikan homepage adalah kelas yang valid
            val intent = Intent(this@target, jenisminuman::class.java)
            startActivity(intent)
        }
        val Next = findViewById<Button>(R.id.btnHistory)
        Next.setOnClickListener {
            // Pastikan homepage adalah kelas yang valid
            val intent = Intent(this@target, history::class.java)
            startActivity(intent)
            finish()
        }
    }
}