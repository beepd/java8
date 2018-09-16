package com.bee.basic;

public class WithLambda {

    public static void main(String args[]) {

        Intref intref = () -> System.out.println("Lambda expression");
        intref.m1();
    }
}
