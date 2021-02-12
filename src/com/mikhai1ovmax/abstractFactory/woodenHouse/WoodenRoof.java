package com.mikhai1ovmax.abstractFactory.woodenHouse;

import com.mikhai1ovmax.abstractFactory.Roof;

public class WoodenRoof implements Roof {
    @Override
    public void printRoofType() {
        System.out.println("wooden roof");
    }
}
