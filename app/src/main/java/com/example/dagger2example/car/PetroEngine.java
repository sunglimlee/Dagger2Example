package com.example.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetroEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;

    @Inject
    public PetroEngine(@Named("horsePower") int horsePower) {
        this.horsePower = horsePower;
        Log.d(TAG, "Petro Engine started... and Horsepower is " + String.valueOf(horsePower));
    }
}
