package com.example.list_cars_two;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.app.Activity;

import android.widget.AdapterView;

import android.widget.ListView;




import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<String> name = new ArrayList<>(),price= new ArrayList<>(),brand = new ArrayList<>(), kilometer = new ArrayList<>(), motor = new ArrayList<>(), guaraty = new ArrayList<>(), year = new ArrayList<>();
    ListView ListViewCar;
    ArrayList<CarFields> items = new ArrayList<>();

    CarsDB connect = new CarsDB(MainActivity.this, CarsConstant.carsDB, null, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        brand.add("Ford");
        brand.add("Mercedez");
        brand.add("BMW");
        name.add("Mustang");
        name.add("AMG g66");
        name.add("X5");
        year.add("2022");
        year.add("2023");
        year.add("2024");
        guaraty.add("5 años");
        guaraty.add("5 años");
        guaraty.add("5 años");
        price.add("$500,000.00");
        price.add("$1000,000.00");
        price.add("$950,000.00");
        motor.add("8CL");
        motor.add("8CL");
        motor.add("8CL");
        kilometer.add("10km");
        kilometer.add("50km");
        kilometer.add("60km");

        for(int i=0; i<3; i++){
            items.add(new CarFields(name.get(i),price.get(i),brand.get(i),year.get(i), motor.get(i), kilometer.get(i),guaraty.get(i)));
            connect.insertData(name.get(i),price.get(i),brand.get(i),motor.get(i),year.get(i), kilometer.get(i),guaraty.get(i));
        }

        ListViewCar = findViewById(R.id.listViewCar);
        Adapter adapter = new Adapter(this, items);
        ListViewCar.setAdapter(adapter);


        ListViewCar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){

                CarFields c = items.get(i);
                registerForContextMenu(ListViewCar);

            }
        });

    }
}