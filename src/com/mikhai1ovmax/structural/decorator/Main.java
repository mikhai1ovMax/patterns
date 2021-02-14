package com.mikhai1ovmax.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Minister minister = new CountryMinister(new RegionalMinister(new CityMinister()));
        Minister minister1 = new CountryMinister(new CityMinister());
        System.out.println(minister1.rule());
    }
}
