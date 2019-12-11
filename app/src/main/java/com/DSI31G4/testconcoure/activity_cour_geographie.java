package com.DSI31G4.testconcoure;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class activity_cour_geographie extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geographie);

        listView = findViewById(R.id.listview_geographie);

        ArrayList<String> questionsList = new ArrayList<>();
        questionsList.add(getResources().getString(R.string.qg1));
        questionsList.add(getResources().getString(R.string.qg2));
        questionsList.add(getResources().getString(R.string.qg3));
        questionsList.add(getResources().getString(R.string.qg4));
        questionsList.add(getResources().getString(R.string.qg5));
        questionsList.add(getResources().getString(R.string.qg6));

        ArrayList<String> reponsesList = new ArrayList<>();
        reponsesList.add(getResources().getString(R.string.rg1));
        reponsesList.add(getResources().getString(R.string.rg2));
        reponsesList.add(getResources().getString(R.string.rg3));
        reponsesList.add(getResources().getString(R.string.rg4));
        reponsesList.add(getResources().getString(R.string.rg5));
        reponsesList.add(getResources().getString(R.string.rg6));

        adapter_ques_rep adapter = new adapter_ques_rep(this, questionsList, reponsesList);
        listView.setAdapter(adapter);

    }
}
