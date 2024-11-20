package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        // Default values
        this.engine = true;
        this.wheels = 4;
    }

    // Getters
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    // Methods
    public String startEngine() {
        String carType = getClass().getSimpleName();
        System.out.println(carType + " -> starting engine");
        return "the car's engine is starting";
    }

    public String accelerate() {
        String carType = getClass().getSimpleName();
        System.out.println(carType + " -> accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        String carType = getClass().getSimpleName();
        System.out.println(carType + " -> braking");
        return "the car is braking";
    }

    // Override toString method
    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", name='" + name + '\'' +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }
}