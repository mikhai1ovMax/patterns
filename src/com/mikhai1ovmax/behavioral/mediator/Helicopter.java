package com.mikhai1ovmax.behavioral.mediator;

public class Helicopter implements FlyingTransport{
   Dispatcher dispatcher;
   String name;


    public Helicopter(Dispatcher dispatcher, String name) {
        this.dispatcher = dispatcher;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String msg) {
        dispatcher.sendMessage(msg, this);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println(name + ": " + msg );
    }
}
