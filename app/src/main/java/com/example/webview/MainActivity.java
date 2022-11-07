
package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // 앱에서 표시할 url 입력
        webView.loadUrl("http://3.234.25.173:5000/");
        webView.setWebViewClient(new WebViewClient());


        //개발자 정보 버튼 클릭시 액티비티 전환
        Button developer_info_btn_map = (Button) findViewById(R.id.map);
        developer_info_btn_map.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), maplayout.class);
                startActivity(intent);
            }
        });
        Button developer_info_btn_remote = (Button) findViewById(R.id.remote);
        developer_info_btn_remote.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), newremote.class);
                startActivity(intent);
            }
        });
        Button developer_info_btn_cvs = (Button) findViewById(R.id.cvs);
        developer_info_btn_cvs.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    //폰의 뒤로가기 버튼의 동작 입력
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

