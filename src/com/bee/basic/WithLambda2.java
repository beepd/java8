package com.bee.basic;

interface Intr2 {
    void add(int a, int b);
}

interface Intr3 {
    int getLength(String s);
}

public class WithLambda2 {
    public static void main(String args[]) {
        Intr2 i = (a, b) -> System.out.println("Sum = " + (a+b));
        i.add(10,20);
        i.add(100,200);

        Intr3 i3 = s -> s.length();
        System.out.println(i3.getLength("Bipin"));
    }
}
