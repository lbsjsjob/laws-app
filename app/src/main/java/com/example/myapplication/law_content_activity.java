package com.example.myapplication;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class law_content_activity extends AppCompatActivity {


    private boolean lawName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_content_activity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //toolbar的样式设置:
        Toolbar mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mtoolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


switch (transferData.TDate){
    case "森林法":
        setmTextView(transferData.TDate);
        break;
    case "森林法实施条例":
        setmTextView(transferData.TDate);
        break;
    case "河南省林地保护管理条例":
        setmTextView(transferData.TDate);
        break;
    case "新森林法":
        setmTextView(transferData.TDate);
        break;
    default:
        break;
}
    }

    private String getTermsString(String lawName) {

        StringBuilder termsString = new StringBuilder();
        BufferedReader reader;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open(lawName + ".txt")));

            String str;
            while ((str = reader.readLine()) != null) {
                termsString.append(str);
            }

            reader.close();
            return termsString.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

void setmTextView(String lawName){
    // 解析html显示于textview

    String htmlAsString = getTermsString(lawName);
    Spanned htmlAsSpanned = Html.fromHtml(htmlAsString);
    TextView textView = (TextView) findViewById(R.id.law_content_textview);
    textView.setText(htmlAsSpanned);
}


}
