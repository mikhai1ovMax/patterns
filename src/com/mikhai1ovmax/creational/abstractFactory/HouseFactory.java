package com.mikhai1ovmax.creational.abstractFactory;

public interface HouseFactory {
    Floor getFloor();
    Roof getRoof();
    Wall getWall();
}
