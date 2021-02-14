package com.mikhai1ovmax.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Car car = new BMW(new Truck());
        car.printCarType();
        car.start();

    }
}
