package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private EditText name,contact,email,password;
private Button submit;
private CheckBox check;

boolean error = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.name_id);
        contact = findViewById(R.id.con_id);
        email = findViewById(R.id.email_id);
        password = findViewById(R.id.pass_id);
        check = findViewById(R.id.checked);
        submit = findViewById(R.id.btnclick);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity2.this,"Checked",Toast.LENGTH_SHORT).show();
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error=CheckAllFields();
                if(error){
                    String Name = name.getText().toString();
                    String Contact = contact.getText().toString();
                    String Email = email.getText().toString();
                    String Password = password.getText().toString();
                    Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                    i.putExtra("name",Name);
                    i.putExtra("contact",Contact);
                    i.putExtra("email",Email);
                    i.putExtra("password",Password);
                    startActivity(i);
                }
            }
        });
    }
    private boolean CheckAllFields(){
        if (name.length()==0){
            name.setError("Required");
            return false;
        }
        if (contact.length()==0){
            contact.setError("Required");
            return false;
        }
        if (email.length()==0){
            email.setError("Required");
            return false;
        }
        if (password.length()==0){
            password.setError("Required");
            return false;
        }
        return true;
    }
}