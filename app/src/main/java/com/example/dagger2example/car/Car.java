package com.example.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;


public class Car {
    public String carName;

    private static final String TAG = "Car";

    @Inject
    public Car(Engine engine, Wheels wheels) {
    }

    public void drive() {
        Log.d(TAG, "driving...");
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
}
