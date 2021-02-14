package com.kidasu.tugasstyleandthemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit_user: EditText = findViewById(R.id.edit_user)
        val btn_login: Button=findViewById(R.id.btn_login)

        btn_login.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("user", edit_user.text.toString())
            startActivity(intent)
        }
    }
}