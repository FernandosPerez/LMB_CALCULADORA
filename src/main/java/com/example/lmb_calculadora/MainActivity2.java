package com.example.lmb_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,suma,resta,div,mult,igual,limpiar,retroceder;
    TextView textView2,textView3;
    int conteo=0;
    int total=0;
    char operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2= (TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        textView3= (TextView)findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        //Botones numéricos

        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"1");
                conteo= Integer.parseInt((String) textView2.getText());

            }
        });

        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"2");
                conteo= Integer.parseInt((String) textView2.getText());



                /*

                contador(conteo);
                conteo++;
                String cont = String.valueOf(conteo);

                textView2.setText(cont);
*/
            }
        });

        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"3");
                conteo= Integer.parseInt((String) textView2.getText());

            }
        });

        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"4");
                conteo= Integer.parseInt((String) textView2.getText());

            }
        });

        b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"5");
                conteo= Integer.parseInt((String) textView2.getText());

            }
        });

        b6=(Button)findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"6");
                conteo= Integer.parseInt((String) textView2.getText());

            }
        });

        b7=(Button)findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"7");
                conteo= Integer.parseInt((String) textView2.getText());

            }
        });

        b8=(Button)findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"8");
                conteo= Integer.parseInt((String) textView2.getText());

            }
        });

        b9=(Button)findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"9");
                conteo= Integer.parseInt((String) textView2.getText());

            }
        });

        b0=(Button)findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(String.valueOf(conteo)+"0");
                conteo= Integer.parseInt((String) textView2.getText());

            }
        });

        //botones de operación

        suma=(Button)findViewById(R.id.suma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3.setText(String.valueOf(conteo)+" +");
                contador(conteo,'+');


            }
        });

        resta=(Button)findViewById(R.id.resta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3.setText(String.valueOf(conteo)+" -");
                contador(conteo,'-');


            }
        });

        mult=(Button)findViewById(R.id.mult);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3.setText(String.valueOf(conteo)+" x");
                contador(conteo,'x');


            }
        });

        div=(Button)findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView3.setText(String.valueOf(conteo)+" /");
                contador(conteo,'/');


            }
        });

        igual=(Button)findViewById(R.id.igual);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operador=='+'){
                    int fin = total + conteo;
                    textView3.setText("");
                    textView2.setText(String.valueOf(fin));
                    conteo=fin;
                }else if (operador=='-'){
                    int fin = total - conteo;
                    textView3.setText("");
                    textView2.setText(String.valueOf(fin));
                    conteo=fin;
                }else if (operador=='x'){
                    int fin = total * conteo;
                    textView3.setText("");
                    textView2.setText(String.valueOf(fin));
                    conteo=fin;
                }else if (operador=='/'){
                    int fin = total / conteo;
                    textView3.setText("");
                    textView2.setText(String.valueOf(fin));
                    conteo=fin;
                }

            }
        });

        limpiar=(Button)findViewById(R.id.limpiar);
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView3.setText("");
                textView2.setText("");
                conteo=0;
                operador=' ';
                total=0;

            }
        });

        retroceder=(Button)findViewById(R.id.retroceder);
        retroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String str = String.valueOf(conteo);
                    str = str.substring(0,str.length()-1);
                    textView2.setText(str);
                    conteo=Integer.parseInt(str);

                }

        });

    }



    public void contador(int v, char d){

        total=conteo;
        textView3.setText(String.valueOf(total)+d);
        textView2.setText(" ");
        operador=d;
        conteo=0;
    }



}


