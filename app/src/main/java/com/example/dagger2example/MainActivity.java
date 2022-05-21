package com.example.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2example.car.Car;
import com.example.dagger2example.dagger.CarComponent;
import com.example.dagger2example.dagger.DaggerCarComponent;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Car";
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //carModule이 죽은 이유????
        CarComponent component = DaggerCarComponent.builder()
                //DieselEngineModule을 넣었다. 잘봐라.
                .horsePower(450)
                .engineCapacity(1400)
                        .build();

        //car = component.getCar();
        component.inject(this);
        car.drive();

    }

}