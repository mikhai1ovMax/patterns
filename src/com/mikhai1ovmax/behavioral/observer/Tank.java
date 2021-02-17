package com.mikhai1ovmax.behavioral.observer;

public class Tank implements Observer{
    @Override
    public void ExecuteOrder(String event) {
        System.out.println("tank follows the order: " + event);
    }
}
