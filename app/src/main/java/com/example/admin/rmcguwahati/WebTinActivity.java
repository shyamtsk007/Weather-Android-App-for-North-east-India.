package com.example.admin.rmcguwahati;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebTinActivity extends AppCompatActivity {
    private WebView myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_tin);
        myView = (WebView)findViewById(R.id.tin);
        WebSettings webSettings = myView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myView.loadUrl("http://14.139.247.11/citywx/city_weather.php?id=42317");
        myView.setWebViewClient(new WebViewClient());
        webSettings.setSupportZoom(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowContentAccess(true);
    }
}
