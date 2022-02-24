package com.example.pr10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Intent i = getIntent();
        String username = (String) i.getSerializableExtra("username");
        TextView t1 = findViewById(R.id.msgBox);
        t1.setText("Welcome  "+ username);
    }
}