package com.bee.consumer;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String args[]) {
        Consumer<String> c1 = (s) -> System.out.println(s);
        Consumer<String> c2 = (s) -> System.out.println(s);
        c1.accept("Hello");
        c1.accept("Bipin");

        c1.andThen(c2).accept("xxx");
    }

}
