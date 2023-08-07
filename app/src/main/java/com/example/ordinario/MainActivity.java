package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.Inventario);
        btn2 = (Button) findViewById(R.id.ventas);
        btn3= (Button) findViewById(R.id.salir);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hiciste click en inventario", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),inventario.class);
                startActivity(i);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hiciste click en ventas", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),ventas.class);
                startActivity(i);
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "saliste de la aplicacion", Toast.LENGTH_SHORT).show();
                finishAffinity();
                System.exit(0);
            }

        });



    }
}