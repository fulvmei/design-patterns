package com.fulvmei.desiginpattern.behavioral.chan;

public class Main {
    public static void main(String[] args) {
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}