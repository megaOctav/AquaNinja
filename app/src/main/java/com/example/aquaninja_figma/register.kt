package com.example.aquaninja_figma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Pastikan ID main ada di layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Pastikan ID btnlogin ada di activity_register.xml
        val buttonStart = findViewById<Button>(R.id.btnlogin)
        buttonStart.setOnClickListener {
            // Pastikan homepage adalah kelas yang valid
            val intent = Intent(this@register, homepage::class.java)
            startActivity(intent)
            finish()
        }
    }
}
