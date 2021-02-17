package com.mikhai1ovmax.behavioral.observer;

public class Plane implements Observer{
    @Override
    public void ExecuteOrder(String event) {
        System.out.println("plane follows the order: " + event);
    }
}
