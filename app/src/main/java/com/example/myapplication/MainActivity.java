package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton radio1;
    private ImageView image;
    private Switch page;
    private RadioGroup gp;
    private RadioButton radio2;
    private RadioButton radio3;
    private Button bt1;
    private EditText text;
    private TextClock heure;
    private CheckBox bx1;
    private CheckBox bx2;
    private CheckBox bx3;
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio1=(RadioButton) findViewById(R.id.rd1);
        radio2=(RadioButton) findViewById(R.id.rd2);
        radio3=(RadioButton) findViewById(R.id.rd3);
        bt1=(Button) findViewById(R.id.bt);
        text=(EditText) findViewById(R.id.text);
        gp=(RadioGroup)findViewById(R.id.radiog);
        heure=(TextClock)findViewById(R.id.cl);
        bx1=(CheckBox)findViewById(R.id.bx1);
        bx2=(CheckBox)findViewById(R.id.bx2);
        bx3=(CheckBox)findViewById(R.id.bx3);
        image=(ImageView)findViewById(R.id.imageView6);
        web=(WebView)findViewById(R.id.web);
        page=(Switch)findViewById(R.id.page);
        radio1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heure.setTimeZone("Africa/Douala");
            }
        });
        radio2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heure.setTimeZone("Europe/Paris");
            }
        });
        radio3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heure.setTimeZone("America/New York");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                bt1.setText(text.getText().toString());            }
        });
        bx1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bx1.isChecked()){
                    image.setAlpha(0.3f);
                }else{
                    image.setAlpha(1f);
                }
            }
        });
        bx2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bx2.isChecked()){
                    image.setColorFilter(Color.argb(150,250,0,0));
                }else{
                    image.setColorFilter(null);
                }
            }
        });
        bx3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(bx3.isChecked()){
                    image.setScaleX(2);
                    image.setScaleY(2);
                }else{
                    image.setScaleX(1);
                    image.setScaleY(1);
                }
            }
        });
        web.loadUrl("https://www.google.com");
        web.setVisibility(View.INVISIBLE);
        page.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(page.isChecked()){
                web.setVisibility(View.VISIBLE);
                web.setWebViewClient(new WebViewClient());
                }else{
                    web.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}