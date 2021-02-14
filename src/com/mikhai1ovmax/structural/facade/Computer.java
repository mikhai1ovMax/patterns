package com.mikhai1ovmax.structural.facade;

public class Computer {
    Monitor monitor;
    boolean isActive;

    public Computer(Monitor monitor) {
        this.monitor = monitor;
    }


    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    void showText(String text) {
        if (monitor.isActive()) {
            monitor.setText(text);
            monitor.showText();
        }
    }
}
