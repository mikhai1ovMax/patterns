package com.mikhai1ovmax.factoryMethod;

public class TruckFactory implements  CarFactory{
    @Override
    public Car createCar() {
        return new Truck();
    }
}
