package com.mikhai1ovmax.behavioral.templateMethod;

public class WoodenHouseWithGarageBuilder extends HouseBuilder {
    @Override
    void buildWalls() {
        System.out.println("build wooden walls");
    }

    @Override
    void buildRoof() {
        System.out.println("build wooden roof");
    }

    @Override
    void buildGarage() {
        System.out.println("build garage");
    }
}
