package com.DSI31G4.testconcoure;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class activity_cour_culture extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);

        listView = findViewById(R.id.listview_culture);

        ArrayList<String> questionsList = new ArrayList<>();
        questionsList.add(getResources().getString(R.string.qc1));
        questionsList.add(getResources().getString(R.string.qc2));
        questionsList.add(getResources().getString(R.string.qc3));
        questionsList.add(getResources().getString(R.string.qc4));
        questionsList.add(getResources().getString(R.string.qc5));
        questionsList.add(getResources().getString(R.string.qc6));
        questionsList.add(getResources().getString(R.string.qc7));
        questionsList.add(getResources().getString(R.string.qc8));
        questionsList.add(getResources().getString(R.string.qc9));
        questionsList.add(getResources().getString(R.string.qc10));

        ArrayList<String> reponsesList = new ArrayList<>();
        reponsesList.add(getResources().getString(R.string.rc1));
        reponsesList.add(getResources().getString(R.string.rc2));
        reponsesList.add(getResources().getString(R.string.rc3));
        reponsesList.add(getResources().getString(R.string.rc4));
        reponsesList.add(getResources().getString(R.string.rc5));
        reponsesList.add(getResources().getString(R.string.rc6));
        reponsesList.add(getResources().getString(R.string.rc7));
        reponsesList.add(getResources().getString(R.string.rc8));
        reponsesList.add(getResources().getString(R.string.rc9));
        reponsesList.add(getResources().getString(R.string.rc10));

        adapter_ques_rep adapter = new adapter_ques_rep(this, questionsList, reponsesList);
        listView.setAdapter(adapter);
    }
}
