package com.ultimatecrazy.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage constructor(){

    fun display(context: Context,message:String){

        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}