package com.example.view0118

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //리다이렉트 되는 경우 크롬 앱이 아니라 현재 애플리케이션의 웹뷰로 열도록 설정 추가
        webView.webViewClient = WebViewClient()

        //웹 뷰가 URL을 로드하는 코드
        webView.loadUrl("http://www.tjoeun.co.kr")

        this.btngo.setOnClickListener({
            val url = addr.text.toString()
            webView.loadUrl(url)
        })

        btnback.setOnClickListener({
            webView.goBack()
        })

        btnforward.setOnClickListener({
            webView.goForward()
        })

        btnlocal.setOnClickListener({
            webView.loadUrl("file://android_asset/test.html")
        })
    }
}