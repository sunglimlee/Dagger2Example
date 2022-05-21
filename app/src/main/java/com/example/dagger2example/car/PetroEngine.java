package com.example.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetroEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetroEngine( @Named("horse power") int horsePower, @Named("engine capacity")int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        Log.d(TAG, "Petro Engine started... and Horsepower is " +
                String.valueOf(horsePower) +
                " and Engine Capacity is " +
                String.valueOf(engineCapacity)

        );
    }
}
