package org.example.arge;

public class Main {
    public static void main(String[] args) {
        // Creating instances using polymorphism
        //CarSkeleton[] cars = {
        //        new GasPoweredCar("Sedan", "Family car", 15.5, 4),
        //        new ElectricCar("Tesla", "Electric sedan", 400.0, 75),
        //        new HybridCar("Prius", "Hybrid car", 20.5, 8, 4)
        //};

        // Testing each car
        //for (CarSkeleton car : cars) {
        //    System.out.println("\nTesting car:");
        //    car.startEngine();
        //    car.drive();
       // }

        CarSkeleton gasCar = new GasPoweredCar("Sedan", "Family car", 15.5, 4);

        // For ElectricCar: name, description, avgKmPerCharge, batterySize
        CarSkeleton electricCar = new ElectricCar("Tesla", "Electric sedan", 400.0, 75);

        // For HybridCar: name, description, avgKmPerLitre, batterySize, cylinders
        CarSkeleton hybridCar = new HybridCar("Prius", "Hybrid car", 20.5, 8, 4);

        // Testing GasPoweredCar
        System.out.println("\nTesting Gas Powered Car:");

        gasCar.startEngine();
        gasCar.drive();

        // Testing ElectricCar
        System.out.println("\nTesting Electric Car:");

        electricCar.startEngine();
        electricCar.drive();

        // Testing HybridCar
        System.out.println("\nTesting Hybrid Car:");

        hybridCar.startEngine();
        hybridCar.drive();
    }
}