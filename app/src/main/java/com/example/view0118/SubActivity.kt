package com.example.view0118

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        //앞의 Activity가 전달한 데이터 읽기
        val intent = getIntent()
        val msg = intent.getStringExtra("name")
        lblSub.text = msg

        //버튼의 클릭 이벤트
        btnMainCall.setOnClickListener({
            val intent = Intent()
            //데이터 저장
            intent.putExtra("parts","페리스V3")
            //응답코드와 데이터를 전달
            setResult(101, intent)
            //자신의 Activity종료
            finish()
        })
    }
}