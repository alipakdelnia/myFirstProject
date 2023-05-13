package com.example.myfirstproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var btContact: Button? = null
    var btWeb: Button? = null
    var btMap: Button? = null
    var btCall: Button? = null
    var requsetCode=1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btContact = findViewById(R.id.bt_contact)
        btWeb = findViewById(R.id.bt_web)
        btMap = findViewById(R.id.bt_map)
        btCall = findViewById(R.id.bt_call)
        listener()

    }

    private fun listener() {
        btContact?.setOnClickListener{
            var contact = Intent(Intent.ACTION_PICK)
            contact.type=ContactsContract.Contacts.CONTENT_TYPE
            startActivityForResult(contact,requsetCode)
        }

        btWeb?.setOnClickListener{
            var website = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.golbama.com/blog/types-of-rose-flowers"))
            startActivity(website)
        }

        btMap?.setOnClickListener{
            var map = Intent(Intent.ACTION_VIEW,Uri.parse("geo:51.1657,10.4515"))
            startActivity(map)
        }

        btCall?.setOnClickListener{
            var call=Intent(Intent.ACTION_DIAL, Uri.parse("tel:09370982564"))
            startActivity(call)
        }

    }

}

