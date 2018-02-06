package com.kotlin.test.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kotlin.test.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val first_btn = findViewById<Button>(R.id.button)
        first_btn.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}
