package com.mikhai1ovmax.behavioral.templateMethod;

public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new WoodenHouseWithGarageBuilder();
        houseBuilder.buildHouse();
        System.out.println(" ");

        HouseBuilder houseBuilder1 = new BrickHouseBuilder();
        houseBuilder1.buildHouse();

    }
}
