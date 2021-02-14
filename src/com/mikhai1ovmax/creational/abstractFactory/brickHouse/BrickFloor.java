package com.mikhai1ovmax.creational.abstractFactory.brickHouse;

import com.mikhai1ovmax.creational.abstractFactory.Floor;

public class BrickFloor implements Floor {
    @Override
    public void printFloorType() {
        System.out.println("brick floor");
    }
}
