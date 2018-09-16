package com.bee.staticmethod;

interface StaticTest {
    static void m1() {
        System.out.println("Static method");
    }
}

class Test implements StaticTest {
}

public class StaticMethodTest {
    public static void main(String args[]){
        Test t = new Test();
        //t.m1(); X COMPILE TIME ERROR
        //Test.m1(); X COMPILE TIME ERROR
        StaticTest.m1();
    }
}
