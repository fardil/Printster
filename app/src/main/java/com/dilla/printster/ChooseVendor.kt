package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_vendor.*
import kotlinx.android.synthetic.main.activity_first.*

class ChooseVendor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_vendor)

        btnBackChooseVendor.setOnClickListener {
            val intent = Intent(this, Size::class.java)
            startActivity(intent)
        }

        btnVendor1.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }

        btnVendor2.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }

        btnVendor3.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }

        btnVendor4.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }
    }
}
