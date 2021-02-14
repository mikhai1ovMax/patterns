package com.mikhai1ovmax.creational.factoryMethod;

public class TruckFactory implements  CarFactory{
    @Override
    public Car createCar() {
        return new Truck();
    }
}
