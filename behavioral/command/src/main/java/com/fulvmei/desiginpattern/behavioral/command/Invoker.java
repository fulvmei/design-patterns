package com.fulvmei.desiginpattern.behavioral.command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doSomething() {
        System.out.println("This is Invoker，doSomething");
        command.execute();
    }
}
