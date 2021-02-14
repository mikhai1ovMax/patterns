package com.mikhai1ovmax.creational.builder;

public class Plane {
    private String name;
    private int passengers;
    private int weight;


    public void setName(String name) {
        this.name = name;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", passengers=" + passengers +
                ", weight=" + weight +
                '}';
    }
}
