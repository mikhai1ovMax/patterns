package com.mikhai1ovmax.behavioral.state;

public class Cooker {
    State state;

    public Cooker(State state) {
        this.state = state;
    }

    void changeActivity(){
        if(state instanceof CookingMeat)
            state = new CookingPotato();
        else
            state = new CookingMeat();
    }

    void cook(){
        state.doSomething();
    }
}
