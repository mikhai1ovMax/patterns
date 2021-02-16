package com.mikhai1ovmax.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        String[] tools = {"nails", "hummer"};
        Builder builder = new Builder(tools);
        Iterator iterator = builder.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
