package MotorVehicles.motorlandvehicles;

import MotorVehicles.app.Engine;
import MotorVehicles.motorlandvehicles.MotorLandVehicle;

public
class Car extends MotorLandVehicle {
    public int numberOfDoors;

    public Car(Engine engine, String brand, String year, String licensePlate, String numberOfWheels, int numberOfDoors) {
        super(engine, brand, year, licensePlate, numberOfWheels);
        this.numberOfDoors = numberOfDoors;

    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", licensePlate='" + licensePlate + '\'' +
                ", numberOfWheels='" + numberOfWheels + '\'' +
                ", brand= " + getBrand() +
                ", year= " + getYear() + " " +
                getEngine().toString()+
                '}';
    }
}
