package com.example.admin.rmcguwahati;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NowSilcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_silc);
        String pilihan = "l";
        if (pilihan.equals("l")) {
            WebView webview = (WebView) findViewById(R.id.nowsilc);
            WebSettings mWebSetting = webview.getSettings();
            mWebSetting.setJavaScriptEnabled(true);
            mWebSetting.setSupportZoom(false);
            mWebSetting.setAllowFileAccess(true);
            mWebSetting.setAllowContentAccess(true);

            webview.setWebViewClient(new MyBrowser());
            String pdf = "http://www.imdguwahati.gov.in/nowsilchar.pdf";
            webview.loadUrl("http://drive.google.com/viewerng/viewer?embedded=true&url=" + pdf);
        }
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            view.loadData("madhgd dh", "text/html", "utf-8");

            super.onReceivedError(view, request, error);
        }

    }

}
