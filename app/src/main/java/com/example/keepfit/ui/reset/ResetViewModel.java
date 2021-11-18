package com.example.keepfit.ui.reset;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResetViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ResetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is reset fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}