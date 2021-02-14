package com.mikhai1ovmax.behavioral.chainOfResponsibility;

public abstract class Developer {
    private Developer nextDeveloper;
    private int posibilities;

    public Developer(int posibilities) {
        this.posibilities = posibilities;
    }

     void solveProblem(int problemLevel){
        if(problemLevel > posibilities){
            if(nextDeveloper != null)
                nextDeveloper.solveProblem(problemLevel);
        }
        else
            printMessage();

    }

    public void setNextDeveloper(Developer nextDeveloper) {
        this.nextDeveloper = nextDeveloper;
    }

    public Developer getNextDeveloper() {
        return nextDeveloper;
    }

    abstract void printMessage();
}
