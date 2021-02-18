package com.mikhai1ovmax.behavioral.visitor;

public class Phone implements Device{
    @Override
    public void used(Human human) {
        human.use(this);
    }
}
