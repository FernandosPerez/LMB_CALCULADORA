package com.example.lmb_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button suma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    suma=(Button) findViewById(R.id.suma);
    suma.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Toast.makeText(getApplicationContext(),"suma",Toast.LENGTH_LONG).show();

        }
    });



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