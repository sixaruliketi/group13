package com.example.group13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.nextButton).setOnClickListener {
            Toast.makeText(this, "you've reached the end", Toast.LENGTH_SHORT).show()
        }
    }
}