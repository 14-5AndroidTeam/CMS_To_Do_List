package com.nise.a6th

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addbtn.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.mainhome,addd())
                .commit()
        }
    }
}

