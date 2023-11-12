package com.example.contactapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val avtText = findViewById<TextView>(R.id.avtText1)
        val name = findViewById<TextView>(R.id.contactName1)
        val phone = findViewById<TextView>(R.id.contactNum1)
        val mail = findViewById<TextView>(R.id.email)

        val bundle: Bundle? = intent.extras
        avtText.text = bundle?.getString("contactName")?.first().toString()
        name.text = bundle?.getString("contactName")
        phone.text = bundle?.getString("contactNum")
        mail.text = bundle?.getString("email")
    }
}