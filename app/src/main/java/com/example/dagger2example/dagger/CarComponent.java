package com.example.dagger2example.dagger;

import com.example.dagger2example.MainActivity;
import com.example.dagger2example.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {CarModule.class, PetroEngineModule.class })
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
    //CarComponent에서 Builder 객체를 Override해서 바꿔 넣겠다는 거지.
    @Component.Builder
    interface Builder {

        //how to @Named ????
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
