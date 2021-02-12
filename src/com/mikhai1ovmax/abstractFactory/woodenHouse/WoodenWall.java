package com.mikhai1ovmax.abstractFactory.woodenHouse;

import com.mikhai1ovmax.abstractFactory.Wall;

public class WoodenWall implements Wall {
    @Override
    public void printWallType() {
        System.out.println("wooden wall");
    }
}
