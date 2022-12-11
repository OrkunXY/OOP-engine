package MotorVehicles.motorwatervegicles;

import MotorVehicles.app.Engine;

public class Yatch extends MotorWaterVehicle {
    public int numberOfBeds;
    public String engineBrand;

    public Yatch(Engine engine, String brand, String year, int numberOfEngine, int width, int height, String registry, String hullMaterial, int numberOfCabin, int numberOfBeds, String engineBrand) {
        super(engine, brand, year, numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.numberOfBeds = numberOfBeds;
        this.engineBrand = engineBrand;
    }

    @Override
    public String toString() {
        return "Yatch{" +
                "numberOfBeds=" + numberOfBeds +
                ", engineBrand=" + engineBrand +
                '}';
    }
}
