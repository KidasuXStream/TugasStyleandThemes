package com.kidasu.tugasstyleandthemes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val t_user: TextView = findViewById(R.id.tampil_user)

        t_user.setText(intent.getStringExtra("user"))
    }
}