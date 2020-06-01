package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnNavBarHome1.setOnClickListener {
            val intent = Intent(this, NavigationBar::class.java)
            startActivity(intent)
        }

        btnDesign.setOnClickListener {
            val intent = Intent(this, FrontDesign::class.java)
            startActivity(intent)
        }
    }
}
