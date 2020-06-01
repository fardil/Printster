package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_size.*

class Size : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_size)

        btnBackSize.setOnClickListener {
            val intent = Intent(this, backDesign::class.java)
            startActivity(intent)
        }

        btnNextSize.setOnClickListener {
            val intent = Intent(this, ChooseVendor::class.java)
            startActivity(intent)
        }
    }
}
