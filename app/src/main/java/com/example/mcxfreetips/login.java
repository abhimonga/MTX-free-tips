package com.example.mcxfreetips;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.flags.impl.zzf;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class login extends AppCompatActivity {
    EditText phone;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //git
        setContentView(R.layout.activity_login);
        phone=(EditText)findViewById(R.id.phone);
        submit=(Button)findViewById(R.id.submit);
    }
    public void submit(View v){
        String mobile = phone.getText().toString().trim();

        if(mobile.isEmpty() || mobile.length() < 10){
            phone.setError("Enter a valid mobile");
            phone.requestFocus();
            return;
        }

        Intent intent = new Intent(login.this, Verify_activity.class);
        intent.putExtra("mobile", mobile);
        startActivity(intent);


    }
}
