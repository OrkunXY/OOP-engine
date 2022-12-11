package MotorVehicles.app;

import MotorVehicles.app.Engine;

public class MotorVehicle {

    Engine engine;
    String brand;
    String year;

    public MotorVehicle(Engine engine, String brand, String year) {
        this.engine = engine;
        this.brand = brand;
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}


