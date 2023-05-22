package com.example.myfirstproject

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myName=resources.getString(R.string.my_name)
        var daysOfWeek=findViewById<TextView>(R.id.myNameText)
        var days = ""
        var day=resources.getStringArray(R.array.daysOfWeek)
        for (i in day){
            days+="$i \n"
        }
        daysOfWeek.text=days
        daysOfWeek.setTextColor(ContextCompat.getColor(this,R.color.yellow))

    }




//    }


}




