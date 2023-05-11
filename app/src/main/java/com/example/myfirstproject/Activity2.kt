package com.example.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    var name: String = ""
    var tvNamee: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        tvNamee = findViewById(R.id.tv_name)
        name=intent.getStringExtra("name").toString()
        tvNamee?.setText(name)
    }
}