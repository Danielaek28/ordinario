package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ventas extends AppCompatActivity {
    Button btn7;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas);
        btn7 = (Button) findViewById(R.id.btn7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Regresaste al inicio", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        listView=(ListView) findViewById(R.id.productos);
        String[] nombre={"Mochila Escolar clásica.","Mochila escolar con ruedas","Mochila escolar bandolera","Mochila bolso"};
        String[] precio={"$650","$800","$528","$320"};
        String[] idpro={"23141","23142","23143","23144"};
        Integer[] idimagen={R.drawable.img_6,R.drawable.img_5,R.drawable.img_4,R.drawable.img_3};
        adaptador adapter = new adaptador(this, nombre, precio, idpro, idimagen);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent,View view, int position, long id){
                Toast.makeText(getApplicationContext(), "Seleccionaste el producto:"+nombre, Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),ticket.class);
                startActivity(i);
            }
        });
    }
}