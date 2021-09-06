package com.marcos.cafedaemilia;

import android.app.Activity;

import android.os.Bundle;

import android.widget.AdapterView;
import android.widget.ListView;

import android.view.View;

import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the listener
        AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id){
                if(position == 2){
                    Intent intent = new Intent(MainActivity.this, KissanguaListActivity.class);
                    startActivity(intent);
                }
            }
        };

        //adding to the list view
        ListView listView = (ListView) findViewById(R.id.options_list);
        listView.setOnItemClickListener(onItemClick);
    }
}