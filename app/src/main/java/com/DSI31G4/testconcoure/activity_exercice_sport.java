package com.DSI31G4.testconcoure;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_exercice_sport extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_sport);

        listView = findViewById(R.id.listview_exercice_sport);


    }
}
