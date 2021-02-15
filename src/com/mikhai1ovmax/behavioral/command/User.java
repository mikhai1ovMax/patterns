package com.mikhai1ovmax.behavioral.command;

public class User {
    Command start;
    Command stop;
    Command mineBitcoin;

    public User(Command start, Command stop, Command mineBitcoin) {
        this.start = start;
        this.stop = stop;
        this.mineBitcoin = mineBitcoin;
    }

    void startComputer(){
        start.execute();
    }

    void  stopComputer(){
        stop.execute();
    }
    void mine(){
        mineBitcoin.execute();
    }
}
