package com.example.ejercicio2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AdatadorFrutas extends ArrayAdapter<Frutas> {

    AppCompatActivity context_activity;

    ArrayList<Frutas> ListaFrutas;

    Integer[] ImgFrutas;

   public AdatadorFrutas(AppCompatActivity context ,ArrayList<Frutas> ListFrutas,Integer[] ImgFruits ) {
        super(context,R.layout.frutas,ListFrutas);
        context_activity = context;
        ListaFrutas = ListFrutas;
        ImgFrutas= ImgFruits;
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = context_activity.getLayoutInflater();
        View item = inflater.inflate(R.layout.frutas, null);
        TextView tvNombre= item.findViewById(R.id.tvNombre);
        TextView tvDescripcion = item.findViewById(R.id.tvDescripcion);
        tvNombre.setText(ListaFrutas.get(position).getNombre());
        tvDescripcion.setText(ListaFrutas.get(position).getDescripcion());
        ImageView imageView1 = item.findViewById(R.id.imageView);
        imageView1.setImageResource(ImgFrutas[position]);
        return(item);
    }


}
