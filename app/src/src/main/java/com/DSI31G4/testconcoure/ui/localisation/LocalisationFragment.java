package com.DSI31G4.testconcoure.ui.localisation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.DSI31G4.testconcoure.R;

public class LocalisationFragment extends Fragment
{
    private LocalisationViewModel localisationViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        localisationViewModel = ViewModelProviders.of(this).get(LocalisationViewModel.class);
        View root = inflater.inflate(R.layout.fragment_localisation, container, false);

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345"));
        startActivity(intent);

        //final TextView textView = root.findViewById(R.id.text_share);

        localisationViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });
        return root;
    }
}