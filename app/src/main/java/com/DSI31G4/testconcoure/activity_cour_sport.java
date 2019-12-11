package com.DSI31G4.testconcoure;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class activity_cour_sport extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        listView = findViewById(R.id.listview_sport);

        ArrayList<String> questionsList = new ArrayList<>();
        questionsList.add(getResources().getString(R.string.qs1));
        questionsList.add(getResources().getString(R.string.qs2));
        questionsList.add(getResources().getString(R.string.qs3));
        questionsList.add(getResources().getString(R.string.qs4));
        questionsList.add(getResources().getString(R.string.qs5));
        questionsList.add(getResources().getString(R.string.qs6));
        questionsList.add(getResources().getString(R.string.qs7));
        questionsList.add(getResources().getString(R.string.qs8));
        questionsList.add(getResources().getString(R.string.qs9));

        ArrayList<String> reponsesList = new ArrayList<>();
        reponsesList.add(getResources().getString(R.string.rs1));
        reponsesList.add(getResources().getString(R.string.rs2));
        reponsesList.add(getResources().getString(R.string.rs3));
        reponsesList.add(getResources().getString(R.string.rs4));
        reponsesList.add(getResources().getString(R.string.rs5));
        reponsesList.add(getResources().getString(R.string.rs6));
        reponsesList.add(getResources().getString(R.string.rs7));
        reponsesList.add(getResources().getString(R.string.rs8));
        reponsesList.add(getResources().getString(R.string.rs9));

        adapter_ques_rep adapter = new adapter_ques_rep(this, questionsList, reponsesList);
        listView.setAdapter(adapter);
    }
}
