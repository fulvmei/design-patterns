package com.fulvmei.desiginpattern.behavioral.visitor;

public class ConcreteElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
