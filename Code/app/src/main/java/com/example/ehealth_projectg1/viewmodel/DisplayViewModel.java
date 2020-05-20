package com.example.ehealth_projectg1.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.ehealth_projectg1.model.repository.FirebaseRepository;

public class DisplayViewModel extends ViewModel {

    //repository
    private FirebaseRepository firebaseRepository;

    public DisplayViewModel(){
        //Init relation with firebase repository
        this.firebaseRepository = new FirebaseRepository();
    }

    public void waterQuantity(int actionTap, int tapStageInt, Context context){
        firebaseRepository.waterQuantity(actionTap, tapStageInt, context);
    }

    public LiveData<String> getWater(Context context){
        return firebaseRepository.getWater(context);
    }
    public LiveData<String> getFallen(Context context){
        return firebaseRepository.getFallen(context);
    }
    public LiveData<String> getTemperature(Context context){
        return firebaseRepository.getTemperature(context);
    }
}
