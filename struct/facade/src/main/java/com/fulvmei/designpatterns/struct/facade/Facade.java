package com.fulvmei.designpatterns.struct.facade;

public class Facade {
    private SubSystem1 obj1 = new SubSystem1();
    private SubSystem2 obj2 = new SubSystem2();
    private SubSystem3 obj3 = new SubSystem3();
    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
