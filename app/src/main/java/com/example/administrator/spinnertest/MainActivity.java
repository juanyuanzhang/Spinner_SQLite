package com.example.administrator.spinnertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner ;

    ArrayList<ColorItem> colorItems ;
    SpinnerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);

       colorItems =new ArrayList<ColorItem>();
       colorItems.add(new ColorItem("blue","#FF40DFFF"));
       colorItems.add(new ColorItem("red","#ff404d"));
       colorItems.add(new ColorItem("green","#40ffbf"));
       colorItems.add(new ColorItem("orange","#ffb940"));
        adapter = new SpinnerAdapter(this,colorItems);
        spinner.setAdapter(adapter);

    }
}
