package com.fulvmei.desiginpattern.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElement());
        ConcreteVisitor visitor = new ConcreteVisitor();
        objectStructure.accept(visitor);
    }
}