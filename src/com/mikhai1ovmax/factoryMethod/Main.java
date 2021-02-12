package com.mikhai1ovmax.factoryMethod;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = createCarFactory(CarType.SPORTCAR);
        Car car = carFactory.createCar();
        car.go();
    }

    static CarFactory createCarFactory(CarType carType){
        switch (carType){
            case TRUCK:return new TruckFactory();
            case SPORTCAR: return new SportCarFactory();
            case SUV: return new SuvFactory();
            default: throw new RuntimeException("no such car");
        }
    }
}
