package com.DSI31G4.testconcoure.ui.examen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExamenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ExamenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("choix de votre test");
    }

    public LiveData<String> getText() {
        return mText;
    }
}