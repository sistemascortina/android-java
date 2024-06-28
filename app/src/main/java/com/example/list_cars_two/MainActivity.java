package com.example.list_cars_two;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView lblEtiqueta;
    private ListView lstCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        lblEtiqueta = (TextView)findViewById(R.id.LblDetail);
        lstCars = (ListView)findViewById(R.id.LstCars);

        final String[][] cars = new
                String [][]{
                        {"Porche", "Caiman", "2024","1000000"},
                        {"Mercedez", "AMG 66", "2020", "1500000"},
                {"BMW", "X5", "2023", "1030000"},
                {"Ford", "Mustang", "2022", "2500000"}};

      /*  ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cars);
        lstCars.setAdapter(adaptador);

        lstCars.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                lblEtiqueta.setText("Opcion Seleccionada: " + cars[position]);
            }
        });*/
    }
}