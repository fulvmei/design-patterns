package com.fulvmei.designpatterns.structural.proxy;

public class RealSubject implements Subject{
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }
}
