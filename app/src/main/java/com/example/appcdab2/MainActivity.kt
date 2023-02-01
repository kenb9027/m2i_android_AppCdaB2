package com.example.appcdab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Intent btn
        val button = findViewById<Button>(R.id.ma_super_page_button)
        button.setOnClickListener {
            val intent = Intent(this, NewActivity2::class.java)
            //ADD ACTION
            intent.action = Intent.ACTION_VIEW
            //ADD CATEGORY
            intent.addCategory("user")
            //ADD EXTRA
            intent.putExtra("name" , "Peter" )
            intent.putExtra("age" , 42)

            startActivity(intent)
        }

        //Parcelable btn
        var profile = Profile("John" , 25)
        val buttonParcelable = findViewById<Button>(R.id.my_profile_btn)
        buttonParcelable.setOnClickListener {

            val intentProfile = Intent(this , ProfileDetails::class.java)
            intentProfile.putExtra("profile" , profile)

            startActivity(intentProfile)

        }


        // LOG
        Log.v( TAG , "Verbose Msg")
        Log.d( TAG , "Debug Msg")
        Log.i( TAG , "Info Msg")
        Log.w( TAG , "Warning Msg")
        Log.e( TAG , "Error Msg")
        Log.println(Log.ASSERT, TAG , "Assert Msg")
    }
}