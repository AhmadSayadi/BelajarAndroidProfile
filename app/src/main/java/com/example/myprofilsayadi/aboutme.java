package com.example.myprofilsayadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutme extends AppCompatActivity {
    WebView w;
    WebSettings ws;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);

        w  = (WebView) findViewById(R.id.about_me);
        ws = w.getSettings();
        w.setWebViewClient(new WebViewClient());
        ws.setJavaScriptEnabled(true);
        ws.setAllowFileAccess(false);
        ws.setGeolocationEnabled(false);
        ws.setAllowContentAccess(false);
        w.loadUrl("https://www.ahmadsayadi.com/p/profile-ahmad-sayadi.html");
    }
}