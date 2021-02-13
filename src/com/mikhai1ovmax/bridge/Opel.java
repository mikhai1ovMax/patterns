package com.mikhai1ovmax.bridge;

public class Opel extends Car {

    protected Opel(CarType carType) {
        super(carType);
    }

    @Override
    public void start() {
        System.out.println("opel is started");
    }
}
