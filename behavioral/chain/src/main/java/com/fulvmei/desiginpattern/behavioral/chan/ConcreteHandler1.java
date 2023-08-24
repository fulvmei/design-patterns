package com.fulvmei.desiginpattern.behavioral.chan;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("ConcreteHandler1 handleRequest");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("no handler");
            }
        }
    }
}
