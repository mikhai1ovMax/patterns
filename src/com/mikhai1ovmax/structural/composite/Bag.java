package com.mikhai1ovmax.structural.composite;

import java.util.List;

public class Bag implements Device {
   List<Device> devices;

    public Bag(List<Device> devices) {
        this.devices = devices;
    }

    public void deleteDevice(Device device){
        devices.remove(device);
    }

    public void addDevice(Device device){
        devices.add(device);
    }

    @Override
    public void print() {
        for (Device device : devices) {
            device.print();
        }
    }
}
