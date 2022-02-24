package com.example.pr7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn  = findViewById(R.id.btn);
        ToggleButton tb = findViewById(R.id.toggleButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status;

                if (tb.isChecked()) {
                     status= "On";
                } else {
                    status= "off";
                }
                    Toast.makeText(MainActivity.this, "Toggle  Button is " + status, Toast.LENGTH_SHORT).show();
            }
        });
    }
}