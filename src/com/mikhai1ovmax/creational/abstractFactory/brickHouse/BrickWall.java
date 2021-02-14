package com.mikhai1ovmax.creational.abstractFactory.brickHouse;

import com.mikhai1ovmax.creational.abstractFactory.Wall;

public class BrickWall implements Wall {
    @Override
    public void printWallType() {
        System.out.println("brick wall");
    }
}
