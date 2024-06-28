package com.example.list_cars_two;
import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class CarsDB extends SQLiteOpenHelper {
    public CarsDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version){
        super(context,name, factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CarsConstant.createTable);
        System.out.println("DATABASE CREEATED.");
    }


}
