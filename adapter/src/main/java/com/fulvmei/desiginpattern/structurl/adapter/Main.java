package com.fulvmei.desiginpattern.structurl.adapter;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.inputPower(new V5PowerAdapter(new V220Power()));
    }
}