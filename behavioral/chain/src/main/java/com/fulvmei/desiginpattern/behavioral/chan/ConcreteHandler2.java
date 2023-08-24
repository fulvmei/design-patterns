package com.fulvmei.desiginpattern.behavioral.chan;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("ConcreteHandler2 handleRequest");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("no handler");
            }
        }
    }
}
