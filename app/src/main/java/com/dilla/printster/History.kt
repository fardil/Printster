package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_home.*

class History : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        btnNavBarHistory1.setOnClickListener {
            val intent = Intent(this, History::class.java)
            startActivity(intent)
        }

        btnDetailPurchase.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            startActivity(intent)
        }
    }
}
