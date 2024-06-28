package com.example.list_cars_two;
import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class CarsDB extends SQLiteOpenHelper {
    public CarsDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CarsConstant.createTable);
        System.out.println("DATABASE CREEATED.");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public long insertData(String carName, String carPrice, String carBrand, String carMotor, String carYear, String carKilometer, String carGuaranty) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cV = new ContentValues();

        cV.put("name", carName);
        cV.put("price", carPrice);
        cV.put("year", carYear);
        cV.put("kilometer", carKilometer);
        cV.put("motor", carMotor);
        cV.put("guaranty", carGuaranty);
        cV.put("brand", carBrand);

        long result = db.insert(CarsConstant.carsTable, null, cV);

    }

    public Cursor rawQuery(String sql, String [] parameters){
        SQLiteDatabase connect = this.getWritableDatabase();
        return connect.rawQuery(sql,parameters);
    }

}
