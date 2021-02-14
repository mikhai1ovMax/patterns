package com.mikhai1ovmax.structural.facade;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.setActive(true);
        Computer computer = new Computer(monitor);
        computer.setActive(true);
        computer.showText("computer is working");

        //or

        SystemAdmin systemAdmin = new SystemAdmin();
        systemAdmin.work();
    }
}
