package com.mikhai1ovmax.builder;

public abstract class PlaneBuilder {
    Plane plane;

    abstract void buildName();
    abstract void buildWeight();
    abstract void buildPassengers();

    void createPlane(){
        plane = new Plane();
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
