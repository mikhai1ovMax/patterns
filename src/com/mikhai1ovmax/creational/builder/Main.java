package com.mikhai1ovmax.creational.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new AirbusPlaneBuilder());
        Plane plane = director.buildPlane();
        System.out.println(plane.toString());
    }
}
