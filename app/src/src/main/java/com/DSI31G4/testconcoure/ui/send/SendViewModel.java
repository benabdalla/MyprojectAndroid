package com.DSI31G4.testconcoure.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SendViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SendViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("info sur utilisation  l'application");
    }

    public LiveData<String> getText() {
        return mText;
    }
}