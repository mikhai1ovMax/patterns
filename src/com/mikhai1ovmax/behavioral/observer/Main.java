package com.mikhai1ovmax.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        CommandCenter commandCenter = new CommandCenter();
        commandCenter.addObserver(new Tank());
        commandCenter.addObserver(new Tank());
        commandCenter.addObserver(new Tank());
        commandCenter.addObserver(new Plane());
        commandCenter.newOrder("Attack");
        commandCenter.newOrder("Go back!");
    }
}
