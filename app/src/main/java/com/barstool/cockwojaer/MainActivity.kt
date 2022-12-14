package com.barstool.cockwojaer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var activityUser = findViewById<Button>(R.id.btnUser)
        var activityRandom = findViewById<Button>(R.id.btnRand)
        var closeBtn = findViewById<Button>(R.id.btnCls)


        activityUser.setOnClickListener(){
            val intent =  Intent(this, UserActivity::class.java)
           startActivity(intent)


        }
        activityRandom.setOnClickListener {
            val intent =  Intent(this, RandomActivity::class.java)
            startActivity(intent)
        }
        closeBtn.setOnClickListener {
            finishAffinity()
        }

    }
}