package com.bee.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String args[]) {
        //check if number is greated than 10
        Predicate<Integer> pi = i -> i > 10;
        System.out.println(pi.test(20));
        System.out.println(pi.test(7));

        //check if string length is greated than 5
        Predicate<String> ps = s -> s.length() > 5;
        System.out.println(ps.test("bipin"));
        System.out.println(ps.test("Solomon"));

        //Check if collection is empty
        Predicate<Collection> pc = c -> c.isEmpty();
        System.out.println(pc.test(new ArrayList()));

        //DEFAULT METHODS
        System.out.println("DEFAULT METHODS");
        pi.negate();
        ps.and(ps);
        pc.or(pc);

        //STATIC METHOD
        Predicate<String> pst = Predicate.isEqual("Bipin");
        System.out.println("STATIC METHODS");
        System.out.println(pst.test("Bipin"));
        System.out.println(pst.test("asdasda"));
    }
}
