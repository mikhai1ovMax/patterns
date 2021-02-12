package com.mikhai1ovmax.abstractFactory;

public interface HouseFactory {
    Floor getFloor();
    Roof getRoof();
    Wall getWall();
}
