package com.mikhai1ovmax.abstractFactory.brickHouse;

import com.mikhai1ovmax.abstractFactory.Roof;

public class BrickRoof implements Roof {
    @Override
    public void printRoofType() {
        System.out.println("brick roof");
    }
}
