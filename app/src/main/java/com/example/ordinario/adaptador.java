package com.example.ordinario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class adaptador extends ArrayAdapter<String> {
    private final ventas context;
    private final String [] nombres;
    private final String [] precios;
    private final String [] idpro;

    private final Integer[] idimagen;

    public adaptador(ventas context, String[] nombres,String[] precios,String[] idpro, Integer[] idimagen) {
        super(context,R.layout.itemm, nombres, precios, idpro);
        this.context=context;
        this.nombres=nombres;
        this.precios=precios;
        this.idpro=idpro;
        this.idimagen=idimagen;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemm, null);
        TextView _nombre = (TextView) rowView.findViewById(R.id.nombre);
        TextView _precio = (TextView) rowView.findViewById(R.id.precio);
        TextView _idpro = (TextView) rowView.findViewById(R.id.idpro);
        ImageView _imagen = (ImageView) rowView.findViewById(R.id.pl1);
        _nombre.setText(nombres[position]);
        _precio.setText(precios[position]);
        _idpro.setText(idpro[position]);
        _imagen.setImageResource(idimagen[position]);
        return rowView;
    }


}
