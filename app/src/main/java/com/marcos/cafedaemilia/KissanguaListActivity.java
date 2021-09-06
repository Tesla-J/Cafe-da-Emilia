package com.marcos.cafedaemilia;

import android.app.Activity;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KissanguaListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kissangua);

        //Setting the adapter
        ArrayAdapter<Kissangua> adapter = new ArrayAdapter<> (this, android.R.layout.simple_list_item_2, Kissangua.KISSANGUAS);

        //ataching the adapter
        ListView listView = (ListView) findViewById(R.id.kissangua_list);
        listView.setAdapter(adapter);
    }
}