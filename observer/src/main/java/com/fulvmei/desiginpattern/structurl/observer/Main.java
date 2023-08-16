package com.fulvmei.desiginpattern.structurl.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Observer());
        subject.addObserver(new Observer());
        subject.update();
    }
}