package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double getAverageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.getAverageKmPerLiter = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.getAverageKmPerLiter = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return getAverageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar -> Starting " + cylinders + " cylinder engine");
    }

    @Override
    public void drive() {
        System.out.println("GasPoweredCar -> Driving with efficiency of " + getAverageKmPerLiter + " km/l");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("GasPoweredCar -> Gas engine running smoothly");
    }
}
