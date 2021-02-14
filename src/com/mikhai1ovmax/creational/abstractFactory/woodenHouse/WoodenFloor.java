package com.mikhai1ovmax.creational.abstractFactory.woodenHouse;

import com.mikhai1ovmax.creational.abstractFactory.Floor;

public class WoodenFloor implements Floor {
    @Override
    public void printFloorType() {
        System.out.println("wooden floor");
    }
}
