package com.vaibhav.lakshya.miet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Automata extends AppCompatActivity {
    private WebView webView;
    private WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_to_micro_p);
        webView=(WebView)findViewById(R.id.webView);
        webSettings=webView.getSettings();
        String url="https://drive.google.com/open?id=1KnHdciPmHy7Uim9aDtQ37yHTXyEb_P7C";
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else
            super.onBackPressed();
    }
}