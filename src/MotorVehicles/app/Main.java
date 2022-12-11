package MotorVehicles.app;

import MotorVehicles.motorlandvehicles.Car;
import MotorVehicles.motorwatervegicles.MotorWaterVehicle;
import MotorVehicles.motorwatervegicles.Sail;
import MotorVehicles.motorwatervegicles.Yatch;

public class Main {
    public static void main(String[] args) {
        Engine engine=new Engine(500, 2000, FuelType.GASOLINE);
        Car car=new Car(engine, "BMW", "1998", "B", "4",2);
        Engine engine1=new Engine(FuelType.ELECTRICITY);
        Car car1=new Car(engine1, "Porsche", "2021", "B","4",4);

        System.out.println(car);
        System.out.println(car1);
        car.getEngine().setEnginePower(100);
        System.out.println(car);

        Engine engine2=new Engine(15,6,FuelType.DIESEL);
        Sail sail=new Sail(engine2,"Yamaha","1998",4,6,25,
                "mersin","carbonfiber",2,"motoboat");
        Sail sail2=new Sail(engine2,"Yamaha","1998",4,6,25,
                "mersin","carbonfiber",2,"motoboat");

        System.out.println(sail);
        System.out.println(sail2);
        sail2.setHullMaterial("wood");
        System.out.println(sail2);

        Yatch yatch=new Yatch(engine2,"honda","2000",4,2,10,"bozyazi","carbonfiber",
                2,4,"Yamaha");
        System.out.println(yatch);










    }
}
