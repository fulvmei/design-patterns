package com.fulvmei.desiginpattern.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("ON");
        System.out.println("Current State : " + originator.getState());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("OFF");
        System.out.println("Current State : " + originator.getState());

        originator.recoveryMemento(caretaker.getMemento());
        System.out.println("Current State : " + originator.getState());
    }
}