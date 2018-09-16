package com.bee.supplier;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String args[]) {
        Supplier<Date> s1 = () -> new Date();
        System.out.println(s1.get());
    }
}
