package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;    // Corrected variable name
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLiter, int batterySize, int cylinders) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {    // Corrected getter name
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar -> Starting " + cylinders + " cylinder engine and " + batterySize + "kWh electric motor");
    }

    @Override
    public void drive() {
        System.out.println("HybridCar -> Driving in hybrid mode with efficiency of " + avgKmPerLiter + " km/l");  // Using corrected variable name
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("HybridCar -> Both gas and electric motors running efficiently");
    }
}