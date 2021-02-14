package com.mikhai1ovmax.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    public static final Map<String, Car> cars = new HashMap<>();

    public Car getCarByCarName(String s) {
        if (!cars.containsKey(s)) {
            switch (s) {
                case "skoda":
                    cars.put("skoda", new Skoda());
                    break;
                case "kia":
                    cars.put("kia", new Kia());
                    break;
                case "bmw":
                    cars.put("bmw", new BMW());
                    break;
            }
        }
        return cars.get(s);
    }

}
