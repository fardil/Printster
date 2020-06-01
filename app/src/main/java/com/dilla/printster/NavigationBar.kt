package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_navigation_bar.*

class NavigationBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_bar)

        btnNavBarHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        btnNavBarProfile.setOnClickListener {
            val intent = Intent(this, ProfileScreenActivity::class.java)
            startActivity(intent)
        }

        btnNavBarVendor.setOnClickListener {
            val intent = Intent(this, Vendor::class.java)
            startActivity(intent)
        }

        btnNavBarHistory.setOnClickListener {
            val intent = Intent(this, History::class.java)
            startActivity(intent)
        }

        btnNavBarContactUs.setOnClickListener {
            val intent = Intent(this, ContactUs::class.java)
            startActivity(intent)
        }

        btnSignOut.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
    }
}
