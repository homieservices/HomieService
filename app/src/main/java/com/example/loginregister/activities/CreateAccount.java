package com.example.loginregister.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.loginregister.R;


public class CreateAccount extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        setTitle("Create an account");
    }

    public void verify(View view){

        Intent intent=new Intent(this,OtpVerification.class);
        startActivity(intent);
    }
}