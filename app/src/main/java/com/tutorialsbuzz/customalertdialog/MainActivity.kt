package com.tutorialsbuzz.customalertdialog

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.custom_layout.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun customAlertDialog(view: View) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val customView = inflater.inflate(R.layout.custom_layout, null, false)

        builder.setView(customView)

        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()

        customView.cancel.setOnClickListener({
            alertDialog.dismiss()
        })

        customView.login.setOnClickListener({
            Toast.makeText(this@MainActivity, customView.userName.text, Toast.LENGTH_SHORT).show()
            alertDialog.dismiss()
        })
    }
}
