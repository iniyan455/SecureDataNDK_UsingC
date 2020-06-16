package com.digitap.securedata

import android.os.Bundle
import android.util.Base64
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    companion object {
        init {
            System.loadLibrary("keys")
        }
    }

    val nativeKey1: String
        external get

    val nativeKey2: String
        external get

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val key1 =  String(Base64.decode(nativeKey1,Base64.DEFAULT));
        val key2 =  String(Base64.decode(nativeKey2,Base64.DEFAULT));
        (findViewById<View>(R.id.key) as TextView).text = " Key1-->$key1 Key2-->${key2}"
    }
}