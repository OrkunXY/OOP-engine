package MotorVehicles.app;

public class Engine {
    private final int DEFAULT_ENGINEPOWER=75;
    private final int DEFAULT_ENGINEVOLUME=1300;



    private FuelType fuelType;
    private int enginePower=DEFAULT_ENGINEPOWER;
    private int engineVolume=DEFAULT_ENGINEVOLUME;

    public Engine(int enginePower, int engineVolume,FuelType fuelType) {
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

    public Engine(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType=" + fuelType +
                ", enginePower=" + enginePower +
                ", engineVolume=" + engineVolume +
                '}';
    }
    //Engine çalıştığında fuelType, DEFAULT_ENGINEPOWER ve DEFAULT_ENGINEVOLUME property' leri tanımlamak zorunlu olsun.

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
}

