package MotorVehicles.motorlandvehicles;

import MotorVehicles.app.Engine;
import MotorVehicles.app.MotorVehicle;

public  abstract class MotorLandVehicle extends MotorVehicle {
    String licensePlate;
    String numberOfWheels;

    public MotorLandVehicle(Engine engine, String brand, String year, String licensePlate, String numberOfWheels) {
        super(engine, brand, year);
        this.licensePlate = licensePlate;
        this.numberOfWheels = numberOfWheels;
        }
}
