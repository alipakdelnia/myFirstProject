package com.example.myfirstproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var bt_context=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         bt_context=findViewById(R.id.bt_context)
         setSupportActionBar(bt_context)

    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.float_menu, menu)

    }

    @Override


    private fun showMessage(message: String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.title){
            "edit" ->{
                showMessage("edit")
            }
            "copy" ->{
                showMessage("copy")
            }
            "delete" ->{
                showMessage("delete")
            }

        }
        return true
    }


}




