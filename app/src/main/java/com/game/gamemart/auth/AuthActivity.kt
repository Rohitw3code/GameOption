package com.game.gamemart.auth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.game.gamemart.MainActivity
import com.game.gamemart.R

class AuthActivity : AppCompatActivity() {
    lateinit var next:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        next = findViewById(R.id.auth_next)

        next.setOnClickListener {
            var intent = Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}