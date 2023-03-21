package com.example.listapersonas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AdaptadorPersonas extends ArrayAdapter<Personas> {

    AppCompatActivity appCompatActivity;
    ArrayList<Personas> Listapersonas;
    Integer[] ImgPpersonas ;
    AdaptadorPersonas(AppCompatActivity context, ArrayList<Personas> listapersonas ,Integer[] imgPersonas) {
        super(context, R.layout.persona, listapersonas);
        appCompatActivity = context;
        Listapersonas = listapersonas;
        ImgPpersonas = imgPersonas;

    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = appCompatActivity.getLayoutInflater();
        View item = inflater.inflate(R.layout.persona, null);
        TextView textView1 = item.findViewById(R.id.tvNombre);
        textView1.setText(Listapersonas.get(position).getNombre());
        ImageView imageView1 = item.findViewById(R.id.imvFoto);
        imageView1.setImageResource(ImgPpersonas[position]);
        return(item);
    }
}
