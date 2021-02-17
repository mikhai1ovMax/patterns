package com.mikhai1ovmax.behavioral.templateMethod;

public abstract class HouseBuilder {
    void buildFloor(){
        System.out.println("build floor");
    }
    void buildWalls(){
        System.out.println("build walls");
    }
    void buildRoof(){
        System.out.println("build roof");
    }
    void putWindows(){
        System.out.println("put windows");
    }

    abstract void buildGarage();

    void buildHouse(){
        buildFloor();
        buildWalls();
        buildRoof();
        putWindows();
        buildGarage();
    }
}
