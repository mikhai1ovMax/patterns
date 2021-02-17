package com.mikhai1ovmax.behavioral.templateMethod;

public class BrickHouseBuilder extends HouseBuilder {
    @Override
    void buildGarage() {
        System.out.println("don't build garage");
    }
}
