package com.example.dailytest_20231028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dailytest_20231028.databinding.ActivityMainBinding
import kotlin.io.path.Path

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnLogin.setOnClickListener {
            val inputEmail = binding.edtEmail.text.toString()
            val inputPwd = binding.edtPassword.text.toString()

            if( inputEmail == "admin@test.com" && inputPwd == "qwer"){
                Toast.makeText(this,"관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"로그인 실패입니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}