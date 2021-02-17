package com.mikhai1ovmax.behavioral.state;

public class CookingMeat implements State{
    @Override
    public void doSomething() {
        System.out.println("Cooking Meat");
    }
}
