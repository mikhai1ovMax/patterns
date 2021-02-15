package com.mikhai1ovmax.behavioral.command;

public class MineBitcoinCommand implements Command{
    Computer computer;

    public MineBitcoinCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.mineBitcoin();
    }
}
