package com.mikhai1ovmax.behavioral.chainOfResponsibility;

public class MiddleDeveloper extends Developer{
    public MiddleDeveloper(int posibilities) {
        super(posibilities);
    }

    @Override
    void printMessage() {
        System.out.println("middle developer solve problem");
    }
}
