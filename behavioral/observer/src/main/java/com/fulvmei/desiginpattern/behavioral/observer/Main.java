package com.fulvmei.desiginpattern.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Observer());
        subject.addObserver(new Observer());
        subject.update();
    }
}