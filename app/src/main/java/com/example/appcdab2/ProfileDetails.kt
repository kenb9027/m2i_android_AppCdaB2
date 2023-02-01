package com.example.appcdab2

import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class ProfileDetails: AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_profile_details)

        //catch Profile in MainActivity
        val profile:Profile = intent.getParcelableExtra("profile")!!
        val nameTextView = findViewById<TextView>(R.id.name)
        val ageTextView = findViewById<TextView>(R.id.age)


        nameTextView.setText("Nom : ${profile?.name}")
        ageTextView.setText("Age : ${profile?.age} ans")
    }
}