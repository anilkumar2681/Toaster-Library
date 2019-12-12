package com.ultimatecrazy.toasterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ultimatecrazy.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {

   // private val toasterMessage:ToasterMessage;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ToasterMessage.display(MainActivity(),"Hello Wellcome")

    }
}
