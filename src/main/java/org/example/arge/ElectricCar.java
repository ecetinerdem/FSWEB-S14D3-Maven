package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize) {
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("ElectricCar -> Initializing electric motor with " + batterySize + "kWh battery");
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar -> Driving with efficiency of " + avgKmPerCharge + " km/charge");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("ElectricCar -> Electric motor running silently");
    }
}
