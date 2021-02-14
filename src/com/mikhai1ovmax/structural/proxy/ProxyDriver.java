package com.mikhai1ovmax.structural.proxy;

public class ProxyDriver implements Driver{
    String city;
    TaxiDriver taxiDriver;

    public ProxyDriver(String city) {
        this.city = city;
    }

    @Override
    public void drive() {
        if(taxiDriver == null)
            taxiDriver = new TaxiDriver(city);
        taxiDriver.drive();
    }
}
