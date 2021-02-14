package com.mikhai1ovmax.structural.adapter;

public class AdapterDVIToHDMI extends DVIMonitor implements HDMIComputer{
    @Override
    public void sendImageToMonitor() {
        showImage();
    }
}
