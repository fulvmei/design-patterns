package com.fulvmei.desiginpattern.behavioral.visitor;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visitor(Element element) {
        System.out.println(getClass().getName() + " visitor");
    }
}
