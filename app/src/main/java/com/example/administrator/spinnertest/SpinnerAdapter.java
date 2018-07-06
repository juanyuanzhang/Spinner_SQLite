package com.example.administrator.spinnertest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinnerAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private ArrayList<ColorItem> colorlist ;

    public SpinnerAdapter(Context c ,ArrayList<ColorItem> colorlist) {
        inflater =(LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
        this.colorlist =colorlist ;
    }

    @Override
    public int getCount() {
        return colorlist.size();
    }

    @Override
    public Object getItem(int position) {
        return colorlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return colorlist.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       ColorItem colorlist = (ColorItem)getItem(position);
       View v = inflater.inflate(R.layout.color_view,null);

        ImageView colorview = (ImageView) v.findViewById(R.id.colorview);
        TextView colorname =(TextView) v.findViewById(R.id.colorname);

        colorview.setBackgroundColor(Color.parseColor(colorlist.code));
        colorname.setText(colorlist.name);

        return v;
    }
}
