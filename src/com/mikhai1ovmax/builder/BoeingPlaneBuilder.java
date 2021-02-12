package com.mikhai1ovmax.builder;

public class BoeingPlaneBuilder extends PlaneBuilder {
    @Override
    void buildName() {
        plane.setName("Boeing 777");
    }

    @Override
    void buildWeight() {
        plane.setWeight(3123);
    }

    @Override
    void buildPassengers() {
        plane.setPassengers(543);
    }
}
