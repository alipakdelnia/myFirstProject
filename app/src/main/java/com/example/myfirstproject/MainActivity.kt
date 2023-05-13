package com.example.myfirstproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var btContact: Button? = null
    var btWeb: Button? = null
    var btMap: Button? = null
    var btCall: Button? = null
    var requsetCode2=1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listener()

    }

    private fun listener() {


    }




}

