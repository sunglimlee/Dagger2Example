package com.example.dagger2example.car;

import android.util.Log;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";
    int horsePower;


    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
        Log.d(TAG, "Diesel Engine started... Horse Poswer is " + horsePower);
    }

}
