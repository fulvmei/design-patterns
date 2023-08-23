package com.fulvmei.desiginpattern.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {

    private Set<Observer> observers = new HashSet<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void update(){
        notifyObservers();
    }

    private void notifyObservers() {
        for (var obs : observers) {
            obs.update();
        }
    }
}
