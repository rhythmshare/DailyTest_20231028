package com.example.dailytest_20231028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dailytest_20231028.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnLogin.setOnClickListener {
            val inputEmail = binding.edtEmail.text.toString()
            val inputPwd = binding.edtPassword.text.toString()
        }
    }
}