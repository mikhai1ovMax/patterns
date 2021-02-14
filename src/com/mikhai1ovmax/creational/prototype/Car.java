package com.mikhai1ovmax.creational.prototype;

public class Car implements Copyable{
    private String name;
    private int horsePower;

    public Car(String name, int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }


    @Override
    public Object copy() {
        return new Car(name,horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
