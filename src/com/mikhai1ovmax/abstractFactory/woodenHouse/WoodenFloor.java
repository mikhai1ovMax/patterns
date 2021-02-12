package com.mikhai1ovmax.abstractFactory.woodenHouse;

import com.mikhai1ovmax.abstractFactory.Floor;

public class WoodenFloor implements Floor {
    @Override
    public void printFloorType() {
        System.out.println("wooden floor");
    }
}
