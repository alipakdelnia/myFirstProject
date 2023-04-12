package com.example.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    var mainLayout: ConstraintLayout? = null
    var btToast: Button? = null
    var btSnackbar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainLayout = findViewById(R.id.root)
        btToast = findViewById(R.id.bt_toast)
        btSnackbar = findViewById(R.id.bt_snackBar)
    }

    private fun listener (){
        btToast?.setOnClickListener(){
            Toast.makeText(this,"hello Ali",Toast.LENGTH_LONG).show()
        }
    }
}
