package com.example.aquaninja_figma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonStart = findViewById<Button>(R.id.btnprofile)
        buttonStart.setOnClickListener { // Berpindah ke Login Screen
            val intent: Intent =
                Intent(
                    this@homepage,
                    profile::class.java
                )
            startActivity(intent)
        }
        val imageButton = findViewById<ImageView>(R.id.btntarget) // Pastikan ID-nya sesuai dengan XML
        imageButton.setOnClickListener {
            val intent = Intent(this@homepage, target::class.java) // Ubah intent sesuai tujuan
            startActivity(intent)
        }
        val image = findViewById<ImageView>(R.id.notifimg) // Pastikan ID-nya sesuai dengan XML
        image.setOnClickListener {
            val intent = Intent(this@homepage, notifikasi::class.java) // Ubah intent sesuai tujuan
            startActivity(intent)
        }
        val imagehist = findViewById<ImageView>(R.id.imageView12) // Pastikan ID-nya sesuai dengan XML
        imagehist.setOnClickListener {
            val intent = Intent(this@homepage, history::class.java) // Ubah intent sesuai tujuan
            startActivity(intent)
        }
    }
}