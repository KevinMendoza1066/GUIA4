package com.example.ejercicio4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AdapterPersonas extends ArrayAdapter<Personas> {

    AppCompatActivity context;

    ArrayList<Personas> Listapersonas;

    AdapterPersonas(AppCompatActivity context, ArrayList<Personas> listapersonas) {
        super(context, R.layout.persona, listapersonas);
        this.context = context;
        Listapersonas = listapersonas;


    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View item = inflater.inflate(R.layout.persona, null);
        TextView tvNombre = item.findViewById(R.id.tvNombre);
        TextView tvEdad = item.findViewById(R.id.tvEdad);
        TextView tvDireccion = item.findViewById(R.id.tvDireccion);
        tvNombre.setText(Listapersonas.get(position).GetNombre());
        tvEdad.setText( Listapersonas.get(position).GetEdad());
        tvDireccion.setText(Listapersonas.get(position).GetDireccion());
        return(item);
    }

}
