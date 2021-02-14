package com.mikhai1ovmax.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<Car> cars = new ArrayList<>();
        cars.add(carFactory.getCarByCarName("bmw"));
        cars.add(carFactory.getCarByCarName("bmw"));
        cars.add(carFactory.getCarByCarName("bmw"));
        cars.add(carFactory.getCarByCarName("kia"));
        cars.add(carFactory.getCarByCarName("kia"));
        cars.add(carFactory.getCarByCarName("kia"));
        cars.add(carFactory.getCarByCarName("skoda"));
        cars.add(carFactory.getCarByCarName("skoda"));

        for (Car car : cars) {
            System.out.println(car.getCarName());
        }

    }
}
