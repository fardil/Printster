package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.dilla.printster.api.model.PrintsterInterface
import com.dilla.printster.api.model.PrintsterService
import com.dilla.printster.api.request.registerRequest
import com.dilla.printster.api.response.registerResponse

import kotlinx.android.synthetic.main.activity_signup.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
                txt_phonenumber.error = "Phone number at least 11 character"
                txt_phonenumber.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                txt_pass.error = "Password required at least 8 character"
                txt_pass.requestFocus()
                return@setOnClickListener
            }

            if (confirm_password != password) {
                txt_confirmpass.error = "Password don't match"
                txt_confirmpass.requestFocus()
                return@setOnClickListener
            }

            val retIn = PrintsterService.getPrintsterService().create(PrintsterInterface::class.java)
            val registerReq =
                registerRequest(email, phone_number, password, confirm_password)
            retIn.register(registerReq)
                .enqueue(object: Callback<registerResponse> {
                    override fun onFailure(call: Call<registerResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(call: Call<registerResponse>, response: Response<registerResponse>) {
                        val registerResponse = response.body()
                        Log.d("Response","$registerResponse")
                        if(registerResponse?.code == 201){
                            Toast.makeText(this@SignUpActivity, "Register success!", Toast.LENGTH_SHORT).show()

//                            getInstance(applicationContext).saveToken(response.body()!!.result)
                            val intent = Intent(applicationContext, LoginActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

                            startActivity(intent)
                        }
                        else{
                            Toast.makeText(this@SignUpActivity, "Register failed!", Toast.LENGTH_SHORT).show()
                        }

                    }
                })
        }
        }

    }
