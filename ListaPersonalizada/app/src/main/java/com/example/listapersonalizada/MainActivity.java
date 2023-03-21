package com.example.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] paises = {"El Salvador","Guatemala","Honduras","Nicaragua","Costa Rica"};
    ListView lvstPais;
    Integer []ImgPais ={
            R.drawable.banderaesa,
            R.drawable.banderaguatemala,
            R.drawable.banderahon,
            R.drawable.banderanic,
            R.drawable.banderacr
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPais adaptador = new AdaptadorPais(this,paises,ImgPais);
        lvstPais = findViewById(R.id.lstPaises);
        lvstPais.setAdapter(adaptador);
    }
}