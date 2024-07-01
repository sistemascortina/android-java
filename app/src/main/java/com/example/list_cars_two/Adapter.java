package com.example.list_cars_two;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    Context context;
    List<CarFields> carFields;
    public Adapter(Context context, List<CarFields> carFields){
        this.context = context;
        this.carFields = carFields;
    }

    @Override
    public int getCount() {
        return carFields.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView LblName;
        TextView LblPrice;
        TextView LblBrand;
        TextView LblYear;

        CarFields c = carFields.get(i);
        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.list_car, null);

        LblName = view.findViewById(R.id.lblName);
        LblPrice = view.findViewById(R.id.lblPrice);
        LblBrand = view.findViewById(R.id.lblBrand);
        LblYear = view.findViewById(R.id.lblYear);

        LblName.setText(String.valueOf(c.name));
        LblPrice.setText(c.price);
        LblBrand.setText(c.brand);
        LblYear.setText(c.year);

        return view;
    }
}
