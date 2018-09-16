package com.bee.defaultmethod;

interface DefaultTest {
    default void m1() {
        System.out.println("Default method");
    }
}

class Test implements DefaultTest {

}

class Test2 implements DefaultTest {
    public void m1(){
        System.out.println("My Default method");
    }
}

public class DefaultMethodTest {
    public static void main(String args[]){
        Test t = new Test();
        t.m1();

        Test2 t2 = new Test2();
        t2.m1();
    }
}
