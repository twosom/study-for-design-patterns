package com.icloud.prototype.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {

        Student twosom = new Student("twosom");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<Student>();
        students.add(twosom);
        students.add(whiteship);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);

    }
}
