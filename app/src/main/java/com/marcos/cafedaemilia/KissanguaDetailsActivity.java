package com.marcos.cafedaemilia;

import android.app.Activity;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

import android.content.Intent;

public class KissanguaDetailsActivity extends Activity {
    public static final String EXTRA_KISSANGUA_ID = "com.marcos.cafedaemilia.KISSANGUA_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kissangua_details);

        ImageView kissanguaImage = (ImageView) findViewById(R.id.kissangua_image);
        TextView kissanguaTitle = (TextView) findViewById(R.id.kissangua_title);
        TextView kissanguaDescription = (TextView) findViewById(R.id.kissangua_description);

        //getting the selected kissangua
        Intent intent = getIntent();
        int kissanguaID = (Integer) intent.getExtras().get(EXTRA_KISSANGUA_ID);
        Kissangua kissangua = Kissangua.KISSANGUAS[kissanguaID];

        //inflating the layout with data
        kissanguaImage.setImageResource(kissangua.getImageID());
        kissanguaImage.setContentDescription(kissangua.getName());
        kissanguaTitle.setText(kissangua.getName());
        kissanguaDescription.setText(kissangua.getDescription());
    }
}