package com.example.appcdab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recup le btn
        val button = findViewById<Button>(R.id.ma_super_page_button)
        button.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }
    }
}