package com.bee.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    int id;
    String name;

    Employee(){}

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id+":"+name ;
    }
}
public class SortingLambda2 {
    public static void main(String args[]) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Bipin"));
        employees.add(new Employee(2, "Mayu"));
        employees.add(new Employee(3, "Venky"));
        employees.add(new Employee(4, "Jai"));
        employees.add(new Employee(5, "Soren"));

        employees.forEach(employee -> System.out.println(employee));

        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));

        employees.forEach(employee -> System.out.println(employee));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
    }
}
