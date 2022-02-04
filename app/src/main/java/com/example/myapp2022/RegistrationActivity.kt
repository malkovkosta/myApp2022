package com.example.myapp2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        Log.d("testlogs", "in onCreate RegistrationActivity")
    }
    override fun onStop() {
        super.onStop()
        Log.d("testlogs", "onStop RegistrationActivity")
        // сохранить данные из полей для ввода
    }
}