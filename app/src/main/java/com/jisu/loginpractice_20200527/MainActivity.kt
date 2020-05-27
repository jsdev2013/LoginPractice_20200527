package com.jisu.loginpractice_20200527

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eventBtn.setOnClickListener {
            Log.d("이벤트 확인", "버튼클릭")
            Log.e("이벤트 확인","에러로그 발생")

            Toast.makeText(this,"버튼이 클릭됨",Toast.LENGTH_SHORT).show()

            val inputContent = contentEdit.text.toString()
            eventBtn.text = inputContent
        }

        loginBtn.setOnClickListener {
            val inputEmail = idEdit.text.toString()
            val inputPw = pwEdit.text.toString()

            if (inputEmail == "admin@test.com" && inputPw == "qwer") {
                Log.d("로그인 확인","관리자 맞음")
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            } else {
                Log.d("아이디 확인","관리자 아님")
                Toast.makeText(this, "관리자 실패했습니다.", Toast.LENGTH_SHORT).show()
            }   

        }
    }
}
