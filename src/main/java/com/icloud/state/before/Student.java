package com.icloud.state.before;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    private List<OnlineCourse> privateOnlineCourses = new ArrayList<>();

    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.privateOnlineCourses.add(onlineCourse);
    }

    public boolean isEnabledForPrivateClass(OnlineCourse onlineCourse) {
        return this.privateOnlineCourses.contains(onlineCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", privateOnlineCourses=" + privateOnlineCourses +
                '}';
    }
}
