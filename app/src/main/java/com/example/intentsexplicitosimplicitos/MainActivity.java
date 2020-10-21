package com.example.intentsexplicitosimplicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnEnviar = (Button) findViewById(R.id.btnSend);

        EditText nombre = (EditText) findViewById(R.id.inputxt1);
        EditText correo = (EditText) findViewById(R.id.inputxt2);
        EditText edad = (EditText) findViewById(R.id.inputxt3);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enviarIntent = new Intent(getApplicationContext(), pantalla2.class);
                enviarIntent.putExtra("nombre", nombre.getText().toString());
                enviarIntent.putExtra("correo", correo.getText().toString());
                enviarIntent.putExtra("edad", edad.getText().toString());
                startActivity(enviarIntent);
            }
        });



       /* final Button btnEnviar = (Button) findViewById(R.id.btnSend);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nombre = (EditText) findViewById(R.id.inputxt1);
                EditText correo = (EditText) findViewById(R.id.inputxt2);
                EditText edad = (EditText) findViewById(R.id.inputxt3);

                String nameString = nombre.getText().toString();
                String correoString = correo.getText().toString();
                String edadString = edad.getText().toString();

                Intent enviarIntent = new Intent(MainActivity.this, pantalla2.class);
                enviarIntent.putExtra("nameString", nameString);
                enviarIntent.putExtra("correoString", correoString);
                enviarIntent.putExtra("edadString", edadString);
                startActivity(enviarIntent);

            }
        });*/








    }
}