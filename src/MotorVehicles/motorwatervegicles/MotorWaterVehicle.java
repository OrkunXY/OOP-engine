package MotorVehicles.motorwatervegicles;

import MotorVehicles.app.Engine;
import MotorVehicles.app.MotorVehicle;

public abstract class MotorWaterVehicle extends MotorVehicle {

    private int numberOfEngine;
    private int width;
    private int height;
    private String registry;
    private String hullMaterial;
    private int numberOfCabin;


    public MotorWaterVehicle(Engine engine, String brand, String year, int numberOfEngine, int width, int height, String registry, String hullMaterial, int numberOfCabin) {
        super(engine, brand, year);
        this.numberOfEngine = numberOfEngine;
        this.width = width;
        this.height = height;
        this.registry = registry;
        this.hullMaterial = hullMaterial;
        this.numberOfCabin = numberOfCabin;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public void setNumberOfEngine(int numberOfEngine) {
        this.numberOfEngine = numberOfEngine;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public int getNumberOfCabin() {
        return numberOfCabin;
    }

    public void setNumberOfCabin(int numberOfCabin) {
        this.numberOfCabin = numberOfCabin;
    }
}
