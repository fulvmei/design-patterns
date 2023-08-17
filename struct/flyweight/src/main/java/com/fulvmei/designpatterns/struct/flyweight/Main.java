package com.fulvmei.designpatterns.struct.flyweight;

public class Main {
    public static void main(String[] args) {
        Color red1 = ColorFactory.getColor("Red");
        System.out.println("red1=" + red1);
        Color red2 = ColorFactory.getColor("Red");
        System.out.println("red2=" + red2);
        Color black = ColorFactory.getColor("Black");
        System.out.println("black=" + black);
    }
}