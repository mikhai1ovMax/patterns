package com.mikhai1ovmax.behavioral.chainOfResponsibility;

public class SeniorDeveloper extends Developer{
    public SeniorDeveloper(int posibilities) {
        super(posibilities);
    }

    @Override
    void printMessage() {
        System.out.println("senior developer solve problem");

    }
}
