package com.marcos.cafedaemilia;

import android.app.Activity;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;

import android.view.View;

import android.content.Intent;

public class KissanguaListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kissangua);

        //Setting the adapter
        ArrayAdapter<Kissangua> adapter = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, Kissangua.KISSANGUAS);

        //ataching the adapter
        ListView listView = (ListView) findViewById(R.id.kissangua_list);
        listView.setAdapter(adapter);

        //setting the listener
        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> listView, View v, int position, long id){
                Intent intent = new Intent(KissanguaListActivity.this, KissanguaDetailsActivity.class);
                intent.putExtra(KissanguaDetailsActivity.EXTRA_KISSANGUA_ID, (int) id); //it also works with position in this case
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(listener);
    }
}