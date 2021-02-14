package com.mikhai1ovmax.structural.proxy;

public class TaxiDriver implements Driver{
    String city;

    public TaxiDriver(String city) {
        this.city = city;
        System.out.println("driver is hired in " + city);
    }

    @Override
    public void drive() {
        System.out.println( "taxi driver is working in " + city);
    }
}
