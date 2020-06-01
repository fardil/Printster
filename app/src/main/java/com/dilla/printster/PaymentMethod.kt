package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_vendor.*
import kotlinx.android.synthetic.main.activity_payment_method.*

class PaymentMethod : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_method)

        btnBackPaymentMethod.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }

        btnFinish.setOnClickListener {
            val intent = Intent(this, FinishDesign::class.java)
            startActivity(intent)
        }
    }
}
