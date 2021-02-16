package com.mikhai1ovmax.behavioral.mediator;

import java.util.List;

public class CommonDispatcher implements Dispatcher{
    Plane plane;
    Helicopter helicopter;
    UFO ufo;

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setHelicopter(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    public void setUfo(UFO ufo) {
        this.ufo = ufo;
    }

    @Override
    public void sendMessage(String msg, FlyingTransport flyingTransport) {
        if(plane != flyingTransport)
            plane.getMessage(msg);
        if(helicopter != flyingTransport)
            helicopter.getMessage(msg);
        if(ufo != flyingTransport)
            ufo.getMessage(msg);
    }
}
