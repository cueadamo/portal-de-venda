package com.example.portal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Site : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_site)



        var view = findViewById<WebView>(R.id.view);

        view.loadUrl(intent.getStringExtra("url"));
    }
}
