package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String carType = getClass().getSimpleName();
        System.out.println(carType + " -> starting engine with Holden technology");
        return "the car's engine is starting";
    }

    @Override
    public String accelerate() {
        String carType = getClass().getSimpleName();
        System.out.println(carType + " -> accelerating with Holden power");
        return "the car is accelerating";
    }

    @Override
    public String brake() {
        String carType = getClass().getSimpleName();
        System.out.println(carType + " -> braking with Holden brake system");
        return "the car is braking";
    }
}