package com.mikhai1ovmax.behavioral.chainOfResponsibility;

public class JuniorDeveloper extends Developer {

    public JuniorDeveloper(int posibilities) {
        super(posibilities);
    }

    @Override
    void printMessage() {
        System.out.println("junior developer solve problem");
    }
}
