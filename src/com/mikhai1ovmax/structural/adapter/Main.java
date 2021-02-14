package com.mikhai1ovmax.structural.adapter;

public class Main {
    public static void main(String[] args) {
    HDMIComputer hdmiComputer = new AdapterDVIToHDMI();
    hdmiComputer.sendImageToMonitor();
    }
}
