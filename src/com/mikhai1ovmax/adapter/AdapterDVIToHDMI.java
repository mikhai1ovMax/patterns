package com.mikhai1ovmax.adapter;

public class AdapterDVIToHDMI extends DVIMonitor implements HDMIComputer{
    @Override
    public void sendImageToMonitor() {
        showImage();
    }
}
