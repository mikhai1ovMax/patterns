package com.mikhai1ovmax.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Cooker cooker = new Cooker(new CookingMeat());
        cooker.cook();
        cooker.changeActivity();
        cooker.cook();
    }
}
