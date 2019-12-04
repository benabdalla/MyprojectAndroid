package com.DSI31G4.testconcoure.ui.acceuil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AcceuilViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AcceuilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("bienvennue sur test nationale");
    }

    public LiveData<String> getText() {
        return mText;
    }
}