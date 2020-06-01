package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_profile.*
import kotlinx.android.synthetic.main.activity_home.*

class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        btnBackEditProfile.setOnClickListener {
            val intent = Intent(this, ProfileScreenActivity::class.java)
            startActivity(intent)
        }

        btnFinishEditProfile.setOnClickListener {
            val intent = Intent(this, ProfileScreenActivity::class.java)
            startActivity(intent)
        }
    }
}
