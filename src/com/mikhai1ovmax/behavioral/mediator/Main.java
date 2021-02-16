package com.mikhai1ovmax.behavioral.mediator;

public class Main  {
    public static void main(String[] args) {
        CommonDispatcher dispatcher = new CommonDispatcher();
        UFO ufo = new UFO(dispatcher, "ufo");
        Plane plane = new Plane(dispatcher, "plane");
        Helicopter helicopter = new Helicopter(dispatcher, "heli");
        dispatcher.setHelicopter(helicopter);
        dispatcher.setPlane(plane);
        dispatcher.setUfo(ufo);

        plane.sendMessage("message from plane");
        ufo.sendMessage("message from ufo");
    }
}
