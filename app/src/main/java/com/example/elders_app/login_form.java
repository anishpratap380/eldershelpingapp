package com.example.elders_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("LOGIN FORM");
    }

    public void btn_signupForm(View view) {
        startActivity(new Intent(getApplicationContext(),signup_form.class));
    }
}