package com.mikhai1ovmax.behavioral.visitor;

public interface Human {
    void use(Notebook notebook);
    void use(Phone phone);
    void use(SmartWatch smartWatch);
}
