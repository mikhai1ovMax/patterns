package com.mikhai1ovmax.behavioral.visitor;

public class Devices implements Device {
    Device[] devices;

    public Devices() {
        devices = new Device[]{
                new SmartWatch(),
                new Phone(),
                new Notebook()};
    }

    @Override
    public void used(Human human) {
        for (Device device : devices) {
            device.used(human);
        }
    }
}
