package com.mikhai1ovmax.behavioral.strategy;

public class CookingPotato implements State {
    @Override
    public void doSomething() {
        System.out.println("Cooking potato");
    }
}
