package com.mikhai1ovmax.creational.abstractFactory.brickHouse;

import com.mikhai1ovmax.creational.abstractFactory.Roof;

public class BrickRoof implements Roof {
    @Override
    public void printRoofType() {
        System.out.println("brick roof");
    }
}
