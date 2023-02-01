package com.example.appcdab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NewActivity2 : AppCompatActivity() {
    val TAG = "NewActivity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new2)


        //DEFINE ACTION
        var action = intent.action
        //i catch category
        val isUserView = intent.hasCategory("user")
        // charge extra bundle
        val extras: Bundle? = intent.extras
        val name = extras?.getString("name")
        val age = extras?.getInt("age")

        Log.i(TAG , "action: $action, isUserViewer: $isUserView, name: $name , age: $age  ")
    }
}