package com.example.hw_m3_1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second2);

        TextView textView = findViewById(R.id.textView);
        String password = getIntent().getStringExtra("password");
        textView.setText("Password : " + password);

    }
}