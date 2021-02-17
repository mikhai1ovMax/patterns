package com.mikhai1ovmax.behavioral.strategy;

public class CookingMeat implements State {
    @Override
    public void doSomething() {
        System.out.println("Cooking Meat");
    }
}
