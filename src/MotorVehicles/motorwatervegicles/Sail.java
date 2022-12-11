package MotorVehicles.motorwatervegicles;

import MotorVehicles.app.Engine;

public class Sail extends MotorWaterVehicle {
    String type;

    public Sail(Engine engine, String brand, String year, int numberOfEngine, int width, int height, String registry, String hullMaterial, int numberOfCabin, String type) {
        super(engine, brand, year, numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.type = type;
    }


    @Override
    public String toString() {
        return "Sail{" +
                "type='" + type + " /" +
                " MotorWaterVehicles{" +
                "numberOfEngine=" + getNumberOfEngine() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", registry=" + getHeight() +
                ", hullMaterial=" + getHullMaterial() +
                ", numberOfCabin=" + getNumberOfCabin() + " / " +
                getEngine().toString() +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
