package com.mikhai1ovmax.builder;

public class Director {
    PlaneBuilder builder;

    public Director(PlaneBuilder builder) {
        this.builder = builder;
    }

    public Director() {
    }

    public void setBuilder(PlaneBuilder builder) {
        this.builder = builder;
    }

    Plane buildPlane(){
        builder.createPlane();
        builder.buildName();
        builder.buildWeight();
        builder.buildPassengers();
        return builder.getPlane();
    }
}
