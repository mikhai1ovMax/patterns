package com.mikhai1ovmax.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class CommandCenter implements Observed{
    List<Observer> observers = new ArrayList<>();
    String order;

    void newOrder(String order){
        this.order = order;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.ExecuteOrder(order);
        }

    }
}
