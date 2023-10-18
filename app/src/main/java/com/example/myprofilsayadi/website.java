package com.example.myprofilsayadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class website extends AppCompatActivity {
    WebView w;
    WebSettings ws;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        w  = (WebView) findViewById(R.id.website);
        ws = w.getSettings();
        w.setWebViewClient(new WebViewClient());
        ws.setJavaScriptEnabled(true);
        ws.setAllowFileAccess(false);
        ws.setGeolocationEnabled(false);
        ws.setAllowContentAccess(false);
        w.loadUrl("https://ahmadsayadi.com");
    }
}