package com.mikhai1ovmax.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        JuniorDeveloperFactory juniorDeveloperFactory = new JuniorDeveloperFactory();
        Developer developer = juniorDeveloperFactory.getDeveloper();
        developer.solveProblem(1);
    }
}
