package com.example.intentsexplicitosimplicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final Button btnEnviar = (Button) findViewById(R.id.btnSend);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        });








    }
}