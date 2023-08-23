package com.fulvmei.desiginpattern.structurl.adapter;

public class V5PowerAdapter extends V5Power {
    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        int power = v220Power.provideV220Power();
        System.out.println("经过电源适配器转换");
        power = power - 215;
        System.out.println("5V电源输出");
        return power;
    }
}
