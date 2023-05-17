package com.example.myfirstproject

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var progressBar: ProgressBar?=null
    var progressBar2: ProgressBar?=null
    var btDownload: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressBar=findViewById(R.id.progressBar)
        progressBar2=findViewById(R.id.progressBar2)
        btDownload=findViewById(R.id.bt_download)
        progressBar?.visibility= View.GONE
        progressBar2?.visibility= View.GONE
        listener()


    }

    private fun listener(){
        btDownload?.setOnClickListener{
            progressBar?.visibility=View.VISIBLE
            progressBar2?.visibility=View.VISIBLE
        }
    }


}




