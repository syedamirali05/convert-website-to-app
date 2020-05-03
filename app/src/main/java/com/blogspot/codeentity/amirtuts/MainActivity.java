package com.blogspot.codeentity.amirtuts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            mywebView = findViewById(R.id.webView);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://codeentity.blogspot.com/");
        mywebView.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed(){
        if(mywebView.canGoBack()){
            mywebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
