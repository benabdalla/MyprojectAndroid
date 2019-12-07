package com.DSI31G4.testconcoure.ui.localisation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocalisationViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public LocalisationViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {
        return mText;
    }
}