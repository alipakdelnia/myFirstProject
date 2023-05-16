package com.example.myfirstproject

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var btAlertDialog: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btAlertDialog=findViewById(R.id.bt_alertDialog)
        listener()

    }

    private fun listener(){
        btAlertDialog?.setOnClickListener{
            alertDialog()
        }
    }
    private fun alertDialog(){
        val alertDialog:AlertDialog.Builder= AlertDialog.Builder(this)
        alertDialog.setTitle("به روز زسانی نرم افزار")
            .setMessage("آیا میخواهید برنامه را به روزرسانی کنید؟")
            .setCancelable(false)
            .setPositiveButton("بله"){_,_ ->
                Toast.makeText(this,"با موفقیت به روزرسانی شد",Toast.LENGTH_LONG).show()}
            .setNegativeButton("خیر"){dialog, _ ->
                dialog.cancel()
            }
            .show()
    }



}

