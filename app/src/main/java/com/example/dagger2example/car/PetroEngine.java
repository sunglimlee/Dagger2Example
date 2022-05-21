package com.example.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class PetroEngine implements Engine {
    private static final String TAG = "Car";
    @Inject
    public PetroEngine() {
        Log.d(TAG, "Petro Engine started...");
    }
}
