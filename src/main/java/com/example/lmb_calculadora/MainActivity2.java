package com.example.lmb_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





    }

    public int suma (int a , int b){
        return a + b;
    }
    public int resta (int a , int b){
        return a - b;
    }
    public int div (int a , int b){
        return a * b;
    }
    public int mult (int a , int b){
        return a / b;
    }

}