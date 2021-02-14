package com.mikhai1ovmax.structural.bridge;

public class Truck implements CarType{
    @Override
    public void printCarType() {
        System.out.println("truck");
    }
}
