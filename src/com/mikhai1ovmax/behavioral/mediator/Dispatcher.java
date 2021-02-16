package com.mikhai1ovmax.behavioral.mediator;

public interface Dispatcher {
    public void sendMessage(String msg, FlyingTransport flyingTransport);
}
