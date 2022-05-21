package com.example.dagger2example.dagger;

import android.util.Log;

import com.example.dagger2example.car.DieselEngine;
import com.example.dagger2example.dagger.DieselEngineModule;
import com.example.dagger2example.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    //원래부터 보이는가 보구나.. 일반클래스이기 때문이다. abstract클래스였으면 안보인다. 그리고 멤버들이 전부 static일때도 안보인다.
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    //왜안되지? 디젤엔진의 생성자가 잘못되었다.
    @Provides
    Engine provideEngine() {
        DieselEngine dieselEngine = new DieselEngine(horsePower);
        return dieselEngine;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

}
