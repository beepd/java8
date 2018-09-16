package com.bee.function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String args[]) {
        Function<String, Integer> f1 = s -> new FunctionTest().asd(s);
        System.out.println(f1.apply("Bipin"));
        System.out.println(f1.apply("Darole"));

        Function<Integer, Integer> f2 = i -> i*i;
        System.out.println(f2.apply(5));
        System.out.println(f2.apply(100));

        Function<String, String> f3 = s -> s.toUpperCase();
        Function<String, String> f4 = s -> s.concat("XXX");
        System.out.println(f3.andThen(f4).apply("bipin")); // executes f3 and passes the output as input to f4

        Function<Integer, Integer> f5 = i -> i + i;
        Function<Integer, Integer> f6 = i -> i *i * i;
        System.out.println(f5.andThen(f6).apply(2)); // 64 / executes f5 and passes the output as input to f6
        System.out.println(f5.compose(f6).apply(2)); // 16 / executes f6 and passes the output as input to f5

        Function<String, String> f7 = Function.identity();
        System.out.println(f7.apply("Darole")); // returns the same input as output
    }

    public int asd(String s){
        return s.length();
    }
}
