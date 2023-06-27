package com.example.webservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText et_num1,et_num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_num1=findViewById(R.id.txtNum1);
        et_num2=findViewById(R.id.txtNum2);
    }
}