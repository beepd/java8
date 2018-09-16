package com.bee.bifunction;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionTest {
    public static void main(String args[]) {
        BiFunction<String, String, String> bf1 = (s1, s2) -> s1.concat(" ").concat(s2);
        System.out.println(bf1.apply("Hi", "Bipin"));

        BiConsumer<String, String> bc1 = (s1, s2) -> System.out.println(s1.concat(" ").concat(s2));
        bc1.accept("hi", "bipin");


    }
}
