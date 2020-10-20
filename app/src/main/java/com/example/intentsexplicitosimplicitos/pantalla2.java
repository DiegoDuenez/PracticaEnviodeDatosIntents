package com.example.intentsexplicitosimplicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {

    final Button paginabtn = (Button) findViewById(R.id.btnPage);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        paginabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paginaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://code.tutsplus.com"));
                startActivity(paginaIntent);
            }
        });


        Bundle extras = getIntent().getExtras();
        String inputName = extras.getString("nameString");
        String inputCorreo = extras.getString("correoString");
        String inputEdad = extras.getString("edadString");

        TextView muestraName = (TextView) findViewById(R.id.name);
        TextView muestraCorreo = (TextView) findViewById(R.id.email);
        TextView muestraEdad = (TextView) findViewById(R.id.edad);

        muestraName.setText(inputName);
        muestraCorreo.setText(inputCorreo);
        muestraEdad.setText(inputEdad);

    }
}