package com.example.contactapp.contact

import android.view.LayoutInflater
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.R

class ContactAdapter(private val contactList: ArrayList<ContactData>, private val listener: IOnItemClickListener): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    interface IOnItemClickListener {
        fun onItemClick(position: Int)
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val avtText = itemView.findViewById<TextView>(R.id.avtText)
        val contactName = itemView.findViewById<TextView>(R.id.contactName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.avtText.text = contactList[position].contactName.first().toString()
        holder.contactName.text = contactList[position].contactName

        holder.itemView.setOnClickListener { listener.onItemClick(position) }

        holder.itemView.setOnCreateContextMenuListener { menu, view, contextMenuInfo ->
            val inflater = MenuInflater(view.context)
            inflater.inflate(R.menu.action_context_menu, menu)
        }
    }

    override fun getItemCount() = contactList.size
}