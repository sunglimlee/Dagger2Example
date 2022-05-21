package com.example.dagger2example.dagger;

import android.util.Log;

import com.example.dagger2example.car.Car;
import com.example.dagger2example.car.Engine;
import com.example.dagger2example.car.Remote;
import com.example.dagger2example.car.Rims;
import com.example.dagger2example.car.Tires;
import com.example.dagger2example.car.Wheels;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

//현재 이 모듈에서 엔진과 휠을 다 인스턴스화하고 하나의 Provides를 통해서 Car 클래스를 넘기고 있다.
//CarModule 자체가 클래스이기 때문에 이 모든게 가능하네...
//그럼 외부에서 데이터를 가지고 들어오는 기능도 중요하다는 거네.. @BindsInstance 같은 것들?
// **** 전부 static이므로 되도록이면 클래스도 abstract로 만들어주자.
@Module
abstract class CarModule {
   private static final String TAG = "Car";



   @Provides
   static Rims provideRims() {
      return new Rims();
   }
   @Provides
   static Tires provideTires() {
      Tires tires;
      tires = new Tires();
      tires.inflated();
      return tires;
   }
   @Provides
   static Wheels provideWheels(Rims rims, Tires tires) {
      return new Wheels(rims, tires);
   }
}
