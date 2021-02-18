package com.mikhai1ovmax.behavioral.visitor;

public class Mother implements Human{
    @Override
    public void use(Notebook notebook) {
        System.out.println("mother use notebook");
    }

    @Override
    public void use(Phone phone) {
        System.out.println("mother use phone");

    }

    @Override
    public void use(SmartWatch smartWatch) {
        System.out.println("mother use smart watch");

    }
}
