package com.mikhai1ovmax.abstractFactory.brickHouse;

import com.mikhai1ovmax.abstractFactory.Wall;

public class BrickWall implements Wall {
    @Override
    public void printWallType() {
        System.out.println("brick wall");
    }
}
