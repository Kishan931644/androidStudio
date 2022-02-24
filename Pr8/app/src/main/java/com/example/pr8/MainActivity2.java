package com.example.pr8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv = findViewById(R.id.tv);
        Intent i = getIntent();
        System.out.println( i.getSerializableExtra("msg"));
        String msg = (String) i.getSerializableExtra("msg");
        tv.setText("Welcome " + msg);
    }
}