package com.example.memorywebviewgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView wvMG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wvMG = findViewById(R.id.webView1);
        WebSettings wvSettings = wvMG.getSettings();
        wvSettings.setJavaScriptEnabled(true);

        wvMG.setWebViewClient(new WebViewClient());

         wvMG.loadUrl("file:///android_asset/wvMG/index.html");
    }

    @Override
    public void onBackPressed() {
        if (wvMG.canGoBack()) {
            wvMG.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}