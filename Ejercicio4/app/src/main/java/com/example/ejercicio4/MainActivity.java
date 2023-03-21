package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Personas> listapersonas;
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapersonas=new ArrayList<Personas>();
        listapersonas.add(new Personas("Kevin",5,"San Salvador"));
        listapersonas.add(new Personas("Emily",15,"San Salvador"));
        listapersonas.add(new Personas("Jorge",15,"San Miguel"));
        AdapterPersonas adaptador = new AdapterPersonas(this,listapersonas);
        lv1 = findViewById(R.id.lvPersonas);
        lv1.setAdapter(adaptador);
    }
}