package com.mikhai1ovmax.factoryMethod;

public class SportCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new SportCar();
    }
}
