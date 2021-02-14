package com.mikhai1ovmax.behavioral.chainOfResponsibility;

public class JuniorDeveloperFactory {
    Developer getDeveloper() {
        Developer developer = new JuniorDeveloper(1);
        developer.setNextDeveloper(new MiddleDeveloper(2));
        developer.getNextDeveloper().setNextDeveloper(new SeniorDeveloper(3));
        return developer;
    }
}
