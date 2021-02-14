package com.mikhai1ovmax.creational.abstractFactory.woodenHouse;

import com.mikhai1ovmax.creational.abstractFactory.Roof;

public class WoodenRoof implements Roof {
    @Override
    public void printRoofType() {
        System.out.println("wooden roof");
    }
}
