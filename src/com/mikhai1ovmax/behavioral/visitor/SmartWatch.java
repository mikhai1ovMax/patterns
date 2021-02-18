package com.mikhai1ovmax.behavioral.visitor;

public class SmartWatch implements Device{
    @Override
    public void used(Human human) {
        human.use(this);
    }
}
