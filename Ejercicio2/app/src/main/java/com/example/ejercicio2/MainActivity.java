package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Frutas> ListaFrutas;
    ListView lvFrutas;

    Integer[]ImgFrutas={
            R.drawable.manzana,
            R.drawable.platano,
            R.drawable.naranja,
            R.drawable.mango,
            R.drawable.fresa,
            R.drawable.pina,
            R.drawable.kiwi,
            R.drawable.sandia,
            R.drawable.melocoton,
            R.drawable.cereza,
            R.drawable.uva,
            R.drawable.limon,
            R.drawable.pera,
            R.drawable.melon,
            R.drawable.granada,
            R.drawable.mandarin,
            R.drawable.frutapasion,
            R.drawable.ciruela,
            R.drawable.higo,
            R.drawable.coco,
            R.drawable.mora,
            R.drawable.pomelo,
            R.drawable.nispero,
            R.drawable.caqui,
            R.drawable.guayaba
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFrutas = findViewById(R.id.lvFrutas);
        ListaFrutas=new ArrayList<Frutas>();
        ListaFrutas.add(new Frutas("Manzana","Una fruta dulce y crujiente que viene en varios colores, como rojo, verde y amarillo."));
        ListaFrutas.add(new Frutas("Plátano","Una fruta amarilla o verde suave y dulce que crece en racimos."));
        ListaFrutas.add(new Frutas("Naranja","Una fruta cítrica que es jugosa y se pela fácilmente."));
        ListaFrutas.add(new Frutas("Mango","Una fruta tropical que es dulce y jugosa con una pulpa suave y fibrosa."));
        ListaFrutas.add(new Frutas("Fresa","Una pequeña fruta roja y dulce que es muy popular en postres."));
        ListaFrutas.add(new Frutas("Piña","Una fruta tropical grande y jugosa con una cáscara dura y escamosa."));
        ListaFrutas.add(new Frutas("Kiwi","Una pequeña fruta marrón y peluda con una pulpa verde y dulce."));
        ListaFrutas.add(new Frutas("Sandía","Una fruta grande y jugosa con una pulpa roja o rosa y una cáscara verde."));
        ListaFrutas.add(new Frutas("Melocotón","Una fruta dulce y jugosa con una pulpa suave y una piel peluda."));
        ListaFrutas.add(new Frutas("Cereza","Una pequeña fruta roja o morada que crece en racimos y tiene un hueso en el centro."));
        ListaFrutas.add(new Frutas("Uva","Una pequeña fruta dulce que crece en racimos y viene en varios colores."));
        ListaFrutas.add(new Frutas("Limón","Una fruta cítrica amarilla y ácida que se utiliza en muchos platos y bebidas."));
        ListaFrutas.add(new Frutas("Pera","Una fruta dulce y jugosa con una piel suave y una pulpa suave."));
        ListaFrutas.add(new Frutas("Melón","Una fruta grande y jugosa con una pulpa naranja o verde y una cáscara dura."));
        ListaFrutas.add(new Frutas("Granada","Una fruta con una cáscara gruesa y dura que contiene muchas semillas dulces."));
        ListaFrutas.add(new Frutas("Mandarina","Una fruta cítrica pequeña y dulce que es fácil de pelar."));
        ListaFrutas.add(new Frutas("Fruta de la pasión","Una fruta tropical con una pulpa dulce y jugosa que se utiliza en postres y bebidas."));
        ListaFrutas.add(new Frutas("Ciruela","Una fruta dulce y jugosa con una piel suave y una pulpa firme."));
        ListaFrutas.add(new Frutas("Higo","Una fruta dulce y jugosa con una piel suave y una pulpa pegajosa."));
        ListaFrutas.add(new Frutas("Coco","Una fruta tropical grande y dura con una pulpa blanca y una cáscara marrón."));
        ListaFrutas.add(new Frutas("Mora","Una pequeña fruta dulce y jugosa que crece en arbustos."));
        ListaFrutas.add(new Frutas("Pomelo","Una fruta cítrica grande y amarga con una pulpa rosa o amarilla."));
        ListaFrutas.add(new Frutas("Níspero","Una fruta dulce y jugosa con una piel suave y una pulpa suave."));
        ListaFrutas.add(new Frutas("Caqui","Una fruta dulce y suave con una piel suave y una pulpa firme."));
        ListaFrutas.add(new Frutas("Guayaba","Una fruta tropical dulce y jugosa con una pulpa rosa o blanca y muchas semillas pequeñas."));
        AdatadorFrutas adaptador = new AdatadorFrutas(this,ListaFrutas,ImgFrutas);
        lvFrutas.setAdapter(adaptador);
    }
}