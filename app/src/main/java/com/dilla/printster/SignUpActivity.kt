package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnLoginSignUp.setOnClickListener {
            //val intent = Intent(this, LoginActivity::class.java)
            //startActivity(intent)

            val email = txt_email.text.toString()
            val phone_number = txt_phonenumber.text.toString()
            val password = txt_pass.text.toString()
            val confirm_password = txt_confirmpass.text.toString()


            if (email.isEmpty()) {
                txt_email.error = "Email required"
                txt_email.requestFocus()
                return@setOnClickListener
            }

            if (phone_number.isEmpty()) {
                txt_phonenumber.error = "Phone number required"
                txt_phonenumber.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                txt_pass.error = "Password required"
                txt_pass.requestFocus()
                return@setOnClickListener
            }


            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            //if(password.get().toString().equals(confirm_password.view().toString())){

//            PrintsterService.instance.register(email, phone_number, password, confirm_password)
//                .enqueue(object : Callback<SignUpResponse> {
//                    override fun onFailure(call: Call<SignUpResponse>, t: Throwable) {
//                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
//                    }
//
//                    override fun onResponse(
//                        call: Call<SignUpResponse>,
//                        response: Response<SignUpResponse>
//                    ) {
//                        Toast.makeText(
//                            applicationContext,
//                            response.body()?.message,
//                            Toast.LENGTH_LONG
//                        ).show()
//                    }
//
//                })
        }

    }

}
