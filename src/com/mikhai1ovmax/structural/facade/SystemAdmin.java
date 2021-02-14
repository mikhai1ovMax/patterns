package com.mikhai1ovmax.structural.facade;

public class SystemAdmin {
    void work() {
        Monitor monitor = new Monitor();
        monitor.setActive(true);
        Computer computer = new Computer(monitor);
        computer.setActive(true);
        computer.showText("computer is working");


    }
}
