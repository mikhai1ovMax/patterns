package com.mikhai1ovmax.creational.factoryMethod;

public class Truck implements Car{
    @Override
    public void go() {
        System.out.println("truck is riding");
    }
}
