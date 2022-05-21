package com.example.dagger2example.dagger;

import com.example.dagger2example.car.Engine;
import com.example.dagger2example.car.PetroEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetroEngineModule {
    @Binds
    abstract Engine bindsEngine(PetroEngine engine);

}
