package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebViewClient;
import android.widget.Toast;
import android.annotation.TargetApi;

public class AboutALCActivity extends AppCompatActivity {
        private WebView ALCWebview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ALCWebview = new WebView(this);
        ALCWebview.getSettings().setJavaScriptEnabled(true);
        ALCWebview.requestFocus();
        final Activity activity = this;
        ALCWebview.setWebViewClient(new WebViewClient(){
            @SuppressWarnings("deprecation")
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl){
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
            @TargetApi(Build.VERSION_CODES.M)
          //  @Override
            public void onRecievedError(WebView view, WebResourceRequest req, WebResourceError rerr, SslError error, SslErrorHandler handler){
             handler.proceed();  onReceivedError(view, rerr.getErrorCode(), rerr.getDescription().toString(),req.getUrl().toString());
            }

        });
        ALCWebview.loadUrl("https://andela.com/about/");
        setContentView( ALCWebview);
    }

}
