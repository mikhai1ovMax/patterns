package com.mikhai1ovmax.creational.prototype;

public class CarFactory {
    Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    public Car copy(){
        return (Car) car.copy();
    }
}
