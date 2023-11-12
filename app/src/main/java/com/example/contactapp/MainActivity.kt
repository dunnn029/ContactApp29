package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.contact.ContactAdapter
import com.example.contactapp.contact.FakeContactSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactData = FakeContactSource().getContact()
        val viewAdapter = ContactAdapter(contactData, object: ContactAdapter.IOnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("contactName", contactData[position].contactName)
                intent.putExtra("contactNum", contactData[position].contactNum)
                intent.putExtra("email", contactData[position].email)
                startActivity(intent)
            }

        })

        val viewContact = findViewById<RecyclerView>(R.id.rcv_contact)
        val linearLayoutManager = LinearLayoutManager(this)

        viewContact.layoutManager = linearLayoutManager
        viewContact.adapter = viewAdapter

        registerForContextMenu(viewContact)
    }
}