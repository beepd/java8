package com.bee.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortClass implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

public class SortingLambda {
    public static void main(String args[]) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Banana");
        myList.add("Grapes");
        myList.add("Papaya");
        myList.add("Gauva");
        myList.add("Apple");

        //WITHOUT LAMBDA
        Collections.sort(myList);
        myList.forEach(s -> System.out.println(s));

        Collections.sort(myList, new SortClass());
        myList.forEach(s -> System.out.println(s));

        //WITH LAMBDA EXPRESSION
        Collections.sort(myList, (s1, s2) -> s2.compareTo(s1));
        myList.forEach(s -> System.out.println(s));
    }
}
