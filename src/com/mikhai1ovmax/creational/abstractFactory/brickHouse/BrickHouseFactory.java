package com.mikhai1ovmax.creational.abstractFactory.brickHouse;

import com.mikhai1ovmax.creational.abstractFactory.Floor;
import com.mikhai1ovmax.creational.abstractFactory.HouseFactory;
import com.mikhai1ovmax.creational.abstractFactory.Roof;
import com.mikhai1ovmax.creational.abstractFactory.Wall;

public class BrickHouseFactory implements HouseFactory {
    @Override
    public Floor getFloor() {
        return new BrickFloor();
    }

    @Override
    public Roof getRoof() {
        return new BrickRoof();
    }

    @Override
    public Wall getWall() {
        return new BrickWall();
    }
}
