package com.mikhai1ovmax.behavioral.visitor;

public class Daughter implements Human{
    @Override
    public void use(Notebook notebook) {
        System.out.println("daughter use notebook");
    }

    @Override
    public void use(Phone phone) {
        System.out.println("daughter use phone");
    }

    @Override
    public void use(SmartWatch smartWatch) {
        System.out.println("daughter use smart watch");
    }
}
