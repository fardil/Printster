package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_back_design.*
import kotlinx.android.synthetic.main.activity_first.*

class backDesign : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_design)

        btnBackDesign.setOnClickListener {
            val intent = Intent(this, FrontDesign::class.java)
            startActivity(intent)
        }

        btnNextBack.setOnClickListener {
            val intent = Intent(this, Size::class.java)
            startActivity(intent)
        }
    }
}
