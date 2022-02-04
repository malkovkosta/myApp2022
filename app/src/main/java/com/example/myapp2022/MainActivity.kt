package com.example.myapp2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("testlogs", "in onCreate MainActivity")

        // инициализировали объект кнопки
        // указали объект кнопки внутри XML
        val registerButton = findViewById<Button>(R.id.main_activity_register_button)
        // прикрепили обработчик нажатия к нашей кнопке
        registerButton.setOnClickListener {
            Log.d("testlogs", "Click Button")
            val intentToAnotherScreen =  Intent(this, RegistrationActivity::class.java)
            startActivity(intentToAnotherScreen)
            Toast.makeText(this@MainActivity, "RegisterClick!", Toast.LENGTH_SHORT).show();
        }

        val loginText = findViewById<TextView>(R.id.main_activity_login_text)
        loginText.setOnClickListener {
            Log.d("testlogs", "Click LoginText")
            val intentToAnotherScreen =  Intent(this, LoginActivity::class.java)
            startActivity(intentToAnotherScreen)
            Toast.makeText(this@MainActivity, "loginClick", Toast.LENGTH_SHORT).show();
        }
        }

    override fun onStop() {
        super.onStop()
        Log.d("testlogs", "onStopLog")
    // сохранить данные из полей для ввода
    }
    }
