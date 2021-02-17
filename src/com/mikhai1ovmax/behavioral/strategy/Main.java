package com.mikhai1ovmax.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        cooker.setState(new CookingMeat());
        cooker.cook();
        cooker.setState(new CookingPotato());
        cooker.cook();
    }
}
