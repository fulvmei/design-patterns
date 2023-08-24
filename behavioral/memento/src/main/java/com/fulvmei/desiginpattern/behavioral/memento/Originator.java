package com.fulvmei.desiginpattern.behavioral.memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(getState());
    }

    public void recoveryMemento(Memento memento){
        this.setState(memento.getState());
    }
}
