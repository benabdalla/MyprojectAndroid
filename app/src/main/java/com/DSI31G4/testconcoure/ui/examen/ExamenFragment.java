package com.DSI31G4.testconcoure.ui.examen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.DSI31G4.testconcoure.R;

public class ExamenFragment extends Fragment {

    private ExamenViewModel examenViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        examenViewModel =
                ViewModelProviders.of(this).get(ExamenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_examen, container, false);
        final TextView textView = root.findViewById(R.id.texte_examen);
        examenViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}