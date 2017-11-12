package sayan.sample.com.sayan_ola_ride_sdk.activities;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import sayan.sample.com.sayan_ola_ride_sdk.AccessTokenManager;
import sayan.sample.com.sayan_ola_ride_sdk.Authenticate;
import sayan.sample.com.sayan_ola_ride_sdk.Constants;
import sayan.sample.com.sayan_ola_ride_sdk.R;
import sayan.sample.com.sayan_ola_ride_sdk.SessionConfig;
import sayan.sample.com.sayan_ola_ride_sdk.interfaces.AuthenticateCallback;

public class LoginActivity extends AppCompatActivity {

    private static SessionConfig config;
    private static AccessTokenManager accessTokenManager;
    private static AuthenticateCallback callback;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Constants.TAG, "Creating LoginActivity.");
        setContentView(R.layout.activity_login);
        final WebView webView = (WebView) findViewById(R.id.loginWebView);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar_id);
        webView.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.VISIBLE);
        webView.loadUrl(config.getoAuthUrl());
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (url.contains("#")) {
                    webView.setVisibility(View.GONE);
                }
                Log.d(Constants.TAG, "Starting page loading.");
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Log.d(Constants.TAG, "Page loading almost done.");
                if (url.contains("permission")) {
                    Log.d(Constants.TAG, "Waiting for user permission.");
                    progressBar.setVisibility(View.GONE);
                    webView.setVisibility(View.VISIBLE);
                }else if (url.contains("#")) {
                    Log.d(Constants.TAG, "Submitting login credentials.");
                    String redirectedUrlFragment = url.substring(url.indexOf("=",url.indexOf("#"))+1, url.indexOf("&", url.indexOf("#")));
                    accessTokenManager.setAccessToken(redirectedUrlFragment);
                    if (webView.getVisibility() == View.VISIBLE){
                        progressBar.setVisibility(View.GONE);
                        webView.setVisibility(View.GONE);
                    }
                    if (progressBar.getVisibility() == View.VISIBLE){
                        progressBar.setVisibility(View.GONE);
                    }
                    Log.d(Constants.TAG, "Login callback initiated.");
                    callback.onAccessTokenSaved(redirectedUrlFragment);
                    Log.d(Constants.TAG, "Returning to main activity.");
                }else if (url.contains("login")) {
                    Log.d(Constants.TAG, "On login page.");
                    if (webView.getVisibility() == View.VISIBLE){
                        progressBar.setVisibility(View.GONE);
                    }
                    if (config.hasUserCredential()) {
                        Log.d(Constants.TAG, "Autologin initiated.");
                        final String jsUrl = "javascript: {" +
                                "document.getElementById('username').value = '" + config.getUserName() + "';" +
                                "document.getElementById('password').value = '" + config.getPassword() + "';" +
                                "document.forms[0].submit(); };";
                        //                            "var elements = document.getElementsByClassName(\"btn btn-primary btn-block\");" +
                        //                            "setTimeout(function(){ elements[0].click(); }, 3000); };";
                        if (Build.VERSION.SDK_INT >= 19) {
                            view.evaluateJavascript(jsUrl, new ValueCallback<String>() {
                                @Override
                                public void onReceiveValue(String s) {
//                                    Toast.makeText(LoginActivity.this, "value: " + s, Toast.LENGTH_SHORT).show();
                                }
                            });
                        } else {
                            view.loadUrl(jsUrl);
                        }
                    }else {
                        webView.setVisibility(View.VISIBLE);
                    }
                }else {
                    if (webView.getVisibility() == View.VISIBLE){
                        progressBar.setVisibility(View.GONE);
                    }
                    Log.d(Constants.TAG, "Unable to load login page, check url: " + url);
                }
            }
        });
        Log.d(Constants.TAG, "LoginActivity almost created.");
    }

    public static class Initializer implements Authenticate.LoginCommunication {

        @Override
        public void initializeVariables(SessionConfig config, AccessTokenManager accessTokenManager, AuthenticateCallback callback) {
            LoginActivity.config = config;
            LoginActivity.accessTokenManager = accessTokenManager;
            LoginActivity.callback = callback;
            Log.d(Constants.TAG, "All variables initiated successfully.");
            Log.d(Constants.TAG, "config: " + config);
            Log.d(Constants.TAG, "accessTokenManager: " + accessTokenManager);
            Log.d(Constants.TAG, "callback: " + callback);
        }
    }
}
