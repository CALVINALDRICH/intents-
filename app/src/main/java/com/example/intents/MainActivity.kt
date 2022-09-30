package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button1 : TextView
    lateinit var button2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button002)
        button2 = findViewById(R.id.btn001)

        button1.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://zalegoacademy.ac.ke/"))
            startActivity(intent)
        }
        button2.setOnClickListener {
            var open = Intent(this, Home::class.java)
            startActivity(open)
        }
    }
}