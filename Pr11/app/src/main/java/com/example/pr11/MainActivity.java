package com.example.pr11;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.pass);
        btn = findViewById(R.id.btn);

        for (EditText editText : Arrays.asList(username, password)) {
            editText.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return checkLogin();
                }
            });
        }
    }

    private boolean checkLogin() {
        if (username.getText().toString().equals("kishan") && password.getText().toString().equals("pass")) {
            btn.setEnabled(true);
            Toast.makeText(this,"true",Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "None", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}