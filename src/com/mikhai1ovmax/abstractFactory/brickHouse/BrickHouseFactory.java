package com.mikhai1ovmax.abstractFactory.brickHouse;

import com.mikhai1ovmax.abstractFactory.Floor;
import com.mikhai1ovmax.abstractFactory.HouseFactory;
import com.mikhai1ovmax.abstractFactory.Roof;
import com.mikhai1ovmax.abstractFactory.Wall;

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
