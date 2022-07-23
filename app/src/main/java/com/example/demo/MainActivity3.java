package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
private TextView a1,a2,a3,a4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        a1=findViewById(R.id.name);
        a2=findViewById(R.id.contact);
        a3=findViewById(R.id.email);
        a4=findViewById(R.id.password);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String contact =i.getStringExtra("contact");
        String email =i.getStringExtra("email");
        String password =i.getStringExtra("password");
        a1.setText(name);
        a2.setText(contact);
        a3.setText(email);
        a4.setText(password);
    }
}