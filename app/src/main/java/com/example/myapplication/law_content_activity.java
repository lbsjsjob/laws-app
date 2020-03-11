package com.example.myapplication;

import android.content.Intent;
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

        Intent intent = getIntent();
        String lawName = intent.getStringExtra("森林法");
switch (lawName){
    case "森林法":
        // 解析html显示于textview
        String htmlAsString = getString(R.string.森林法);      // used by WebView
        Spanned htmlAsSpanned = Html.fromHtml(htmlAsString); // used by TextView
        // set the html content on a TextView
        TextView textView = (TextView) findViewById(R.id.law_content_textview);
        textView.setText(htmlAsSpanned);
        break;
    case "森林法":
    default:
        break;
}
    }
void setmTextView(String lawName){
    // 解析html显示于textview
    String htmlAsString = getString(R.string.lawName);      // used by WebView
    Spanned htmlAsSpanned = Html.fromHtml(htmlAsString); // used by TextView
    // set the html content on a TextView
    TextView textView = (TextView) findViewById(R.id.law_content_textview);
    textView.setText(htmlAsSpanned);
}


}
