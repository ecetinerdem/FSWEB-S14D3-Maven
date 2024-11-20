package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String carType = getClass().getSimpleName();
        System.out.println(carType + " -> starting engine with Ford technology");
        return "the car's engine is starting";
    }

    @Override
    public String accelerate() {
        String carType = getClass().getSimpleName();
        System.out.println(carType + " -> accelerating with Ford power");
        return "the car is accelerating";
    }

    @Override
    public String brake() {
        String carType = getClass().getSimpleName();
        System.out.println(carType + " -> braking with Ford brake system");
        return "the car is braking";
    }
}