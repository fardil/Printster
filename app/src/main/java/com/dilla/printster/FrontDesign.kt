package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_front_design.*

class FrontDesign : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_design)

        btnNavBarFrontDesign.setOnClickListener {
            val intent = Intent(this, NavigationBar::class.java)
            startActivity(intent)
        }

        btnNextFront.setOnClickListener {
            val intent = Intent(this, backDesign::class.java)
            startActivity(intent)
        }
    }
}
