package com.example.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvPaises;
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
        tvPaises = findViewById(R.id.tvPaises);
        lvstPais = findViewById(R.id.lstPaises);
        lvstPais.setAdapter(adaptador);
        lvstPais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                CharSequence text = "Item Seleccionado"+ selectedItem;
                Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
                toast.show();
                tvPaises.append("\n"+selectedItem);
                //textView.setText("The best football player is : " + selectedItem);
            }

        });
    }
}
