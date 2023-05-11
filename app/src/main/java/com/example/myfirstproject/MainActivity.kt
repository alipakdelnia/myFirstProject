package com.example.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var btOk: Button? = null
    var etSend: EditText?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btOk = findViewById(R.id.bt_ok)
        etSend=findViewById(R.id.et_send)
        listener()

    }

    private fun listener() {
        btOk?.setOnClickListener {
            var intent=Intent(this,Activity2::class.java)
            intent.putExtra("name","I sent from activity 1 to here")
            startActivity(intent)

        }

    }

}

