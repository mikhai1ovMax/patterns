package com.mikhai1ovmax.structural.bridge;


public class BMW extends Car {

    protected BMW(CarType carType) {
        super(carType);
    }

    @Override
    public void start() {
        System.out.println("BMW is started");
    }
}
