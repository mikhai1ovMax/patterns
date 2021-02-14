package com.mikhai1ovmax.creational.abstractFactory.woodenHouse;

import com.mikhai1ovmax.creational.abstractFactory.Wall;

public class WoodenWall implements Wall {
    @Override
    public void printWallType() {
        System.out.println("wooden wall");
    }
}
