package com.mikhai1ovmax.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Devices devices = new Devices();

        Daughter daughter = new Daughter();
        Mother mother = new Mother();

        devices.used(daughter);
        devices.used(mother);

    }
}
