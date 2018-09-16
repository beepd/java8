package com.bee.basic;

interface Intr {
    void add(int a, int b);
}

class Demo implements Intr {
    @Override
    public void add(int a, int b) {
        System.out.println("Sum = " +(a+b));
    }
}

public class WithoutLambda2 {
    public static void main(String args[]) {
        Demo d = new Demo();
        d.add(10,20);
        d.add(100,200);
    }
}
