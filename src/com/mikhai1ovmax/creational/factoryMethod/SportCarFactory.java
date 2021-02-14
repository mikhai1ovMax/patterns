package com.mikhai1ovmax.creational.factoryMethod;

public class SportCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new SportCar();
    }
}
