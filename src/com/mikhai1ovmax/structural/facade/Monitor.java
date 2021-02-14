package com.mikhai1ovmax.structural.facade;

public class Monitor {
    boolean isActive;
    String text;


    public Monitor() {
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    void showText() {
        if (isActive)
            System.out.println(text);
    }
}
