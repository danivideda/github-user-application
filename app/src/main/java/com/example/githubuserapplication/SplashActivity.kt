package com.example.githubuserapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val moveIntent = Intent(this, MainActivity::class.java)
        Timer().schedule(500) {
            startActivity(moveIntent)
            finish()
        }
    }
}