package com.mikhai1ovmax.creational.factoryMethod;

public class SuvFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Suv();
    }
}
