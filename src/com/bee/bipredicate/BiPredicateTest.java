package com.bee.bipredicate;

import java.util.Date;
import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String args[]) {
        BiPredicate<String, String> b1 = (s1, s2) -> s1.equals(s2);
        System.out.println(b1.test("b", "b"));
    }
}
