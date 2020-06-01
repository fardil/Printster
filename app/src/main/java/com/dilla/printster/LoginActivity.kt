package com.dilla.printster

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.dilla.printster.api.PrintsterService
import com.dilla.printster.api.SharedPrefManager
import com.dilla.printster.api.SharedPrefManager.Companion.getInstance
import com.dilla.printster.api.loginResponse
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Currency.getInstance

//
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

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

            PrintsterService.instance.login(email,password)
                .enqueue(object: Callback<loginResponse>{
                    override fun onFailure(call: Call<loginResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(call: Call<loginResponse>, response: Response<loginResponse>) {
                        val loginResponse = response.body()
                        Log.d("Response","$loginResponse")
                        if(loginResponse?.code == 200){

                            getInstance(applicationContext).saveToken(response.body()!!.result)
                            val intent = Intent(applicationContext, ProfileScreenActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

                            startActivity(intent)
                        }
                        else{
                            Toast.makeText(applicationContext, response.body()?.message, Toast.LENGTH_LONG).show()
                        }

                    }
                })
        }
    }

    override fun onStart() {
        super.onStart()

        if(SharedPrefManager.getInstance(this).isLoggedIn) {
            val intent = Intent(applicationContext, ProfileScreenActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

            startActivity(intent)
        }
    }
}
