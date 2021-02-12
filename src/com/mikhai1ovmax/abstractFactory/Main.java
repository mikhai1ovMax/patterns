package com.mikhai1ovmax.abstractFactory;

import com.mikhai1ovmax.abstractFactory.brickHouse.BrickHouseFactory;

public class Main {
    public static void main(String[] args) {
        HouseFactory houseFactory = new BrickHouseFactory();
        Roof roof = houseFactory.getRoof();
        Wall wall = houseFactory.getWall();
        Floor floor = houseFactory.getFloor();
        roof.printRoofType();
        wall.printWallType();
        floor.printFloorType();
    }
}
