package com.icloud.state.review

class Student(var name: String) {

    var onlineCourses: MutableSet<OnlineCourse> = mutableSetOf<OnlineCourse>()

    fun isAvailable(onlineCourse: OnlineCourse): Boolean {
        return this.onlineCourses.contains(onlineCourse)
    }

    fun addPrivate(onlineCourse: OnlineCourse) {
        this.onlineCourses.add(onlineCourse)
    }

    override fun toString(): String {
        return "Student(name='$name')"
    }


}