package com.mikhai1ovmax.behavioral.observer;

public interface Observed  {
    void addObserver(Observer observer);
    void notifyObservers();
}
