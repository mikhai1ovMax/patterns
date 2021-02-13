package com.mikhai1ovmax.bridge;

public abstract class Car {
    CarType carType;

    protected Car(CarType carType) {
        this.carType = carType;
    }

    public abstract void start();

    public void printCarType(){
        carType.printCarType();
    }
}
