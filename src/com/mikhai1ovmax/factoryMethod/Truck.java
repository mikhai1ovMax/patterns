package com.mikhai1ovmax.factoryMethod;

public class Truck implements Car{
    @Override
    public void go() {
        System.out.println("truck is riding");
    }
}
