package com.DSI31G4.testconcoure.ui.cours;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.DSI31G4.testconcoure.R;
import com.DSI31G4.testconcoure.activity_cour_culture;
import com.DSI31G4.testconcoure.activity_cour_geographie;
import com.DSI31G4.testconcoure.activity_cour_histoire;
import com.DSI31G4.testconcoure.activity_cour_sport;
import com.DSI31G4.testconcoure.adapter_cours;

import java.util.ArrayList;

public class CoursFragment extends Fragment {

    private CoursViewModel coursViewModel;
    ListView listView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        coursViewModel = ViewModelProviders.of(this).get(CoursViewModel.class);

        View root = inflater.inflate(R.layout.fragment_cours, container, false);

        listView = root.findViewById(R.id.listview_cours);

        ArrayList<String> textList = new ArrayList<>();
        textList.add(getResources().getString(R.string.sport));
        textList.add(getResources().getString(R.string.culture));
        textList.add(getResources().getString(R.string.histoire));
        textList.add(getResources().getString(R.string.geographie));

        ArrayList<Integer>imageList = new ArrayList<>();
        imageList.add((R.drawable.icon_sport));
        imageList.add((R.drawable.icon_culture));
        imageList.add((R.drawable.icon_history));
        imageList.add((R.drawable.icon_geography));


        adapter_cours list = new adapter_cours(getContext(), imageList, textList);
        listView.setAdapter(list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0: startActivity(new Intent(getContext(), activity_cour_sport.class));
                        break;
                    case 1: startActivity(new Intent(getContext(), activity_cour_culture.class));
                        break;
                    case 2: startActivity(new Intent(getContext(), activity_cour_histoire.class));
                        break;
                    case 3: startActivity(new Intent(getContext(), activity_cour_geographie.class));
                        break;
                    default: Toast.makeText(getContext(), "Erreur!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return root;
    }
}