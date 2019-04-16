package com.zx.cordova;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.engine.SystemWebView;

public class MainActivity extends CordovaActivity {

    private SystemWebView mSystemWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSystemWebView = findViewById(R.id.sys_webview_main);
        mSystemWebView.loadUrl("http://www.baidu.com");

    }

}
