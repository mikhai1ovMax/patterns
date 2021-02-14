package com.mikhai1ovmax.creational.abstractFactory.woodenHouse;

import com.mikhai1ovmax.creational.abstractFactory.Floor;
import com.mikhai1ovmax.creational.abstractFactory.HouseFactory;
import com.mikhai1ovmax.creational.abstractFactory.Roof;
import com.mikhai1ovmax.creational.abstractFactory.Wall;

public class WoodenHouseFactory implements HouseFactory {
    @Override
    public Floor getFloor() {
        return new WoodenFloor();
    }

    @Override
    public Roof getRoof() {
        return new WoodenRoof();
    }

    @Override
    public Wall getWall() {
        return new WoodenWall();
    }
}
