package com.mikhai1ovmax.behavioral.command;

public class StopCommand implements Command{
    Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
