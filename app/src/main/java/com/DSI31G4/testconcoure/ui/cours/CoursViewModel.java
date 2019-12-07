package com.DSI31G4.testconcoure.ui.cours;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CoursViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CoursViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {
        return mText;
    }
}