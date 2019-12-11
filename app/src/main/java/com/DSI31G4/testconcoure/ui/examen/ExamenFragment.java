package com.DSI31G4.testconcoure.ui.examen;

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
import com.DSI31G4.testconcoure.activity_cour_sport;
import com.DSI31G4.testconcoure.activity_exercice_sport;
import com.DSI31G4.testconcoure.adapter_examen;

import java.util.ArrayList;

public class ExamenFragment extends Fragment {

    private ExamenViewModel examenViewModel;
    ListView listView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        examenViewModel =
                ViewModelProviders.of(this).get(ExamenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_examen, container, false);

        listView = root.findViewById(R.id.listview_examen);

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


        adapter_examen list = new adapter_examen(getContext(), imageList, textList);
        listView.setAdapter(list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0: startActivity(new Intent(getContext(), activity_exercice_sport.class));
                        break;
                    case 1: Toast.makeText(getContext(), "culture", Toast.LENGTH_SHORT).show();
                        break;
                    case 2: Toast.makeText(getContext(), "activity_cour_histoire", Toast.LENGTH_SHORT).show();
                        break;
                    case 3: Toast.makeText(getContext(), "geographie", Toast.LENGTH_SHORT).show();
                        break;
                    default: Toast.makeText(getContext(), "Erreur!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return root;
    }
}