package com.dilla.printster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnLoginSignUp.setOnClickListener {
            //val intent = Intent(this, LoginActivity::class.java)
            //startActivity(intent)

            val email = txt_email.text.toString().trim()
            val phone_number = txt_phonenumber.text.toString().trim()
            val password = txt_pass.text.toString().trim()
            val confirm_password = txt_confirmpass.text.toString().trim()

            if(email.isEmpty()){
                txt_email.error = "Email required"
                txt_email.requestFocus()
                return@setOnClickListener
            }

            if(phone_number.isEmpty()){
                txt_phonenumber.error = "Phone number required"
                txt_phonenumber.requestFocus()
                return@setOnClickListener
            }

            if(password.isEmpty()){
                txt_pass.error = "Password required"
                txt_pass.requestFocus()
                return@setOnClickListener
            }

            //if(password.get().toString().equals(confirm_password.view().toString())){

            /*PrintsterService.instance.registerUser(email, phone_number, password, confirm_password)
                .enqueue(object: Callback<PrintsterResponse> {
                    override fun onFailure(call: Call<PrintsterResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(
                        call: Call<PrintsterResponse>,
                        response: Response<PrintsterResponse>
                    ) {
                        val PrintsterResponse = response.body()

                        if (PrintsterResponse?.statusCode == 201) {
                            sessionManager.saveAuthToken(PrintsterResponse.authToken)
                        } else {
                            // Error logging in
                        }

                    }
                })*/
        }
    }
}
