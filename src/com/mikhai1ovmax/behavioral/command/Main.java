package com.mikhai1ovmax.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(
                new StartCommand(computer),
                new StopCommand(computer),
                new MineBitcoinCommand(computer)
        );
        user.startComputer();
        user.mine();
        user.stopComputer();

    }
}
