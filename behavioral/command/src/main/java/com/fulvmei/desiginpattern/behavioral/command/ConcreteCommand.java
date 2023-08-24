package com.fulvmei.desiginpattern.behavioral.command;

public class ConcreteCommand implements Command {
    private final Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
