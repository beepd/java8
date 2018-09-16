package com.bee.methodreference;

import java.util.Arrays;
import java.util.List;

interface SomeInterface {
    int sum(int a, int b);
}

public class MRTest {

    public void m1() {
        for (int i=1; i<=10; i++) {
            System.out.println("Child "+ i);
        }
    }

    public int add(int x, int y) {
        return (x + y);
    }

    public static void main(String ars[]) {
        MRTest mrt = new MRTest();
        Thread t = new Thread(mrt::m1);
        t.start();
        for (int i=1; i<=10; i++) {
            System.out.println("Main "+ i);
        }

        SomeInterface si = mrt::add;

        System.out.println();
        System.out.println(si.sum(10, 20));

        final List<Person> people = Arrays.asList(new Person("dan"), new Person("laura"));
        // Method reference
        people.forEach(person -> person.printName());
        people.forEach(Person::printName);
        // Lambda expression
        people.forEach(person -> person.printName());
        // normal
        for (final Person person : people) {
            person.printName();
        }
    }

    private static class Person {
        private String name;
        public Person(final String name) {
            this.name = name;
        }
        public void printName() {
            System.out.println(name);
        }
    }
}


