package com.mikhai1ovmax.composite;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag(Arrays.asList(new Notebook(), new Notebook(), new SmartWatch()));
        Bag bag1 = new Bag(Arrays.asList(new SmartWatch(), new Phone()));
        Bag bag2 = new Bag(Arrays.asList(bag, bag1, new SmartWatch()));
        bag2.print();
    }
}
