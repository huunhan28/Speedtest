package com.example.mylibraryspeedtest

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    fun s(context: Context, message: String) {
         Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}