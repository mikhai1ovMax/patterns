package com.mikhai1ovmax.prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("seat", 321);
        CarFactory carFactory = new CarFactory(car);
        System.out.println(car);
        System.out.println(carFactory.copy());
    }
}
