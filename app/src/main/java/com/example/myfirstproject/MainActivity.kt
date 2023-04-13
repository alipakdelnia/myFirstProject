package com.example.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {

    var names = arrayOf("Ali", "Ahmad", "Asghar", "Emad", "Ehsan")
    var etName: AutoCompleteTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setData()

    }

    private fun setData() {
        etName = findViewById(R.id.et_search)
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,names)
        etName?.threshold = 1
        etName?.setAdapter(adapter)
    }

}

