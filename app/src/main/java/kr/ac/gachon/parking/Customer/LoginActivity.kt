package kr.ac.gachon.parking.Customer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kr.ac.gachon.parking.MainActivity
import kr.ac.gachon.parking.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            val sign_to_main_intent=Intent(this, MainActivity::class.java)
            startActivity(sign_to_main_intent)
        }

        btn_signup.setOnClickListener {
            val signup_intent= Intent(this, SignupActivity::class.java)
            startActivity(signup_intent)
        }
    }
}