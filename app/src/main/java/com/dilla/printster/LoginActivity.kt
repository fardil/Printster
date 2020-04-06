package com.dilla.printster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {

            if(txt_email.text.toString().isEmpty()&&txt_pass.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter email and password",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else if(txt_email.text.toString().isEmpty()){
                txt_email.error = "Please enter correct email"
                txt_email.requestFocus()
                return@setOnClickListener
            }
            else if(txt_pass.text.toString().isEmpty()){
                txt_pass.error = "Please enter password"
                txt_pass.requestFocus()
                return@setOnClickListener
            }
        }
    }
}
