package com.vaibhav.lakshya.miet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DataMining extends AppCompatActivity {
    private WebView webView;
    private WebSettings webSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mining);
        webView=(WebView)findViewById(R.id.webView);
        webSettings=webView.getSettings();
        String url="https://drive.google.com/folderview?id=1-6ybetjNnzBsOCPgagK3v5OXQQC7Zm3o";
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}
