package com.mikhai1ovmax.behavioral.strategy;

public class Cooker {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    void work(){

    }

    void cook(){
        state.doSomething();
    }
}
