package com.example.felicia.timewalkweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.example.felicia.timewalkweb.R.id.webView;


public class MainActivity extends AppCompatActivity {
    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView1=(WebView)findViewById(webView);
        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webView1.setWebChromeClient(new WebChromeClient());
        /*
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        */
        webView1.setWebViewClient(new WebViewClient());

        webView1.loadUrl("file:///android_asset/www/index.html");
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webView1.canGoBack()) {
                        webView1.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}

