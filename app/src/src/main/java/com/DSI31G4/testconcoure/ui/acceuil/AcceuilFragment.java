package com.DSI31G4.testconcoure.ui.acceuil;

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

public class AcceuilFragment extends Fragment {

    private AcceuilViewModel acceuilViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        acceuilViewModel =
                ViewModelProviders.of(this).get(AcceuilViewModel.class);
        View root = inflater.inflate(R.layout.fragment_acceuil, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        acceuilViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

    }
}