package com.example.myapp2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Log.d("testlogs", "in onCreate LoginActivity")

    }

    override fun onStop() {
        super.onStop()
        Log.d("testlogs", "onStop LoginActivity ")
        // сохранить данные из полей для ввода
    }
}