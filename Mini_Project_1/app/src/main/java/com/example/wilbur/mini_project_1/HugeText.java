package com.example.wilbur.mini_project_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class HugeText extends AppCompatActivity {
    TextView hugeText;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huge_text);

        hugeText = (TextView) findViewById(R.id.scrollText);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
    }
}
