package com.example.dagger2example.dagger;

import com.example.dagger2example.car.Engine;
import com.example.dagger2example.car.PetroEngine;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class PetroEngineModule {

    /*
        @Binds
        abstract Engine bindsEngine(PetroEngine engine);
    */
    @Provides
    Engine provideEngine(PetroEngine petroEngine) {
        return petroEngine;
    }

}
