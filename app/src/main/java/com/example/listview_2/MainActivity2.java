package com.example.listview_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        String str2=getIntent().getStringExtra("name");
        String str1=getIntent().getStringExtra("Temple_name");
        txt1.setText(str1);
        txt2.setText(str2);
    }
}