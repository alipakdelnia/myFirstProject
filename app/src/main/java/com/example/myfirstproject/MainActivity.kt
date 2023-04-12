package com.example.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

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
        listener()
    }

    private fun  listener(){
        btToast?.setOnClickListener{
            Toast.makeText(this,"Hello Ali...\n lets go",Toast.LENGTH_LONG).show()
        }
        btSnackbar?.setOnClickListener {
            Snackbar.make(mainLayout!!, "Ali is in game", Snackbar.LENGTH_LONG)
                .setAction("ok") {
                    Toast.makeText(this, "Here we go", Toast.LENGTH_SHORT).show()
                }.setActionTextColor(resources.getColor(R.color.purple_500))
                .setDuration(5000)
                .setBackgroundTint(resources.getColor(R.color.purple_200))
                .show() // Don’t forget to show!
        }



        }
    }

