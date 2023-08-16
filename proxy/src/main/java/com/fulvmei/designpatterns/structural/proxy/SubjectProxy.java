package com.fulvmei.designpatterns.structural.proxy;

public class SubjectProxy implements Subject {
    private RealSubject realSubject = new RealSubject();

    @Override
    public void doSomething() {
        realSubject.doSomething();
    }
}
