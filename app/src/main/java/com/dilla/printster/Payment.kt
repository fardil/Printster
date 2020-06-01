package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_vendor.*
import kotlinx.android.synthetic.main.activity_payment.*

class Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        btnBackPayment.setOnClickListener {
            val intent = Intent(this, ChooseVendor::class.java)
            startActivity(intent)
        }

        btnPaymentMethod.setOnClickListener {
            val intent = Intent(this, PaymentMethod::class.java)
            startActivity(intent)
        }
    }
}
