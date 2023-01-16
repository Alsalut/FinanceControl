package com.example.financecontrol

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAuth = FirebaseAuth.getInstance()

        btn_registration.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        btn_log_in.setOnClickListener {
            mAuth.signInWithEmailAndPassword(et_e_mail.text.toString(), et_password.text.toString())
                .addOnCompleteListener(OnCompleteListener {
                    if (it.isSuccessful) startActivity(Intent(this, LoginOk::class.java))
                    else tv_unregister.text = "Неверный ввод"
                })
        }
    }
}