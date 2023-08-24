package com.fulvmei.desiginpattern.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.doSomething();
    }
}