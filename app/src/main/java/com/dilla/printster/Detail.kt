package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_home.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btnBackDetail.setOnClickListener {
            val intent = Intent(this, History::class.java)
            startActivity(intent)
        }

        btnReview.setOnClickListener {
            val intent = Intent(this, Review::class.java)
            startActivity(intent)
        }
    }
}
