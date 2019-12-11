package com.DSI31G4.testconcoure;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class activity_cour_histoire extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histoire);

        listView = findViewById(R.id.listview_histoire);

        ArrayList<String> questionsList = new ArrayList<>();
        questionsList.add(getResources().getString(R.string.qh1));
        questionsList.add(getResources().getString(R.string.qh2));
        questionsList.add(getResources().getString(R.string.qh3));
        questionsList.add(getResources().getString(R.string.qh4));
        questionsList.add(getResources().getString(R.string.qh5));

        ArrayList<String> reponsesList = new ArrayList<>();
        reponsesList.add(getResources().getString(R.string.rh1));
        reponsesList.add(getResources().getString(R.string.rh2));
        reponsesList.add(getResources().getString(R.string.rh3));
        reponsesList.add(getResources().getString(R.string.rh4));
        reponsesList.add(getResources().getString(R.string.rh5));

        adapter_ques_rep adapter = new adapter_ques_rep(this, questionsList, reponsesList);
        listView.setAdapter(adapter);
    }
}
