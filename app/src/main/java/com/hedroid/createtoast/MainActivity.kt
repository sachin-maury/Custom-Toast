package com.hedroid.createtoast

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import com.shashank.sony.fancytoastlib.FancyToast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btndefault =findViewById<Button>(R.id.btndefault)
        val btnfancy =findViewById<Button>(R.id.btnfancy)
        btndefault.setOnClickListener{
            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.DEFAULT,true).show()
        }

        btnfancy.setOnClickListener{
            FancyToast.makeText(this, "Hello ❤️",FancyToast.LENGTH_SHORT,FancyToast.SUCCESS,false).show()
        }
    }
}