package com.mikhai1ovmax.structural.bridge;

public class Skoda extends Car{
    protected Skoda(CarType carType) {
        super(carType);
    }

    @Override
    public void start() {
        System.out.println("Skoda is started");
    }
}
