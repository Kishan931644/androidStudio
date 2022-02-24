package com.example.pr10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.pass);

        Button btn = findViewById(R.id.submitBtn);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Kishan") && password.getText().toString().equals("pass") ){
                    Intent i = new Intent(MainActivity.this,homepage.class);
                    String un = username.getText().toString();
                    i.putExtra("username",un );
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "Invalid username and password" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}