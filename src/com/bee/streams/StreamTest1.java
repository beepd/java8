package com.bee.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String args[]) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(10);
        integers.add(15);
        integers.add(20);
        integers.add(25);
        integers.add(30);
        integers.add(35);
        integers.add(40);
        integers.add(45);
        integers.add(50);
        List<Integer> s = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        long countS = integers.stream().filter(i -> i % 2 == 0).count(); // 5

        List<Integer> sorted = integers.stream().sorted().collect(Collectors.toList());
        System.out.println(s); //[10, 20, 30, 40, 50]
        System.out.println(countS);

        List<Integer> s2 = integers.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(integers); //[5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
        System.out.println(s2);// [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        List<Integer> sorted2 = integers.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        sorted2.stream().forEach(i -> System.out.println(i));
        System.out.println(sorted2);

        Integer min = integers.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println(min);

        Integer[] toArr = integers.stream().toArray(Integer[]::new);

        Stream<Integer> ss = Stream.of(toArr);
    }
}
