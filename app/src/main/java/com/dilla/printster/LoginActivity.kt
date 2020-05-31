package com.dilla.printster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dilla.printster.api.LoginResponse
import com.dilla.printster.api.PrintsterService
import com.dilla.printster.api.SessionManager
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    private lateinit var SessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        SessionManager = SessionManager(this)

        btnLogin.setOnClickListener {
            val email = txt_email.text.toString().trim()
            val password = txt_pass.text.toString().trim()

            if(email.isEmpty()){
                txt_email.error = "Email required"
                txt_email.requestFocus()
                return@setOnClickListener
            }


            if(password.isEmpty()){
                txt_pass.error = "Password required"
                txt_pass.requestFocus()
                return@setOnClickListener
            }

            PrintsterService.instance.userLogin(email, password)
                .enqueue(object: Callback<LoginResponse>{
                    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                        val LoginResponse = response.body()
                        if(LoginResponse?.code == 200){
                            SessionManager.saveAuthToken(LoginResponse.result?.token)
                            Toast.makeText(applicationContext, response.body()?.message, Toast.LENGTH_LONG).show()

//                            val intent = Intent(applicationContext, ProfileScreenActivity::class.java)
//                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//
//                            startActivity(intent)
                        }
                        else{
                            Toast.makeText(applicationContext, response.body()?.message, Toast.LENGTH_LONG).show()
                        }

                    }
                })



        }
    }
}
