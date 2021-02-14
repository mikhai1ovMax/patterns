package com.mikhai1ovmax.creational.builder;

public class AirbusPlaneBuilder extends PlaneBuilder {
    @Override
    void buildName() {
        plane.setName("Airbus a320");
    }

    @Override
    void buildWeight() {
        plane.setWeight(322333);
    }

    @Override
    void buildPassengers() {
        plane.setPassengers(546);
    }
}
