package com.icloud.state.review

fun main() {
    val onlineCourse = OnlineCourse()
    val student = Student("twosom")
    val hope = Student("hope")
    student.addPrivate(onlineCourse)

    onlineCourse.addStudent(student)

    onlineCourse.changeState(Private(onlineCourse))
    hope.addPrivate(onlineCourse)
    onlineCourse.addStudent(hope)

    onlineCourse.addReview("Good", student)

    println(onlineCourse.state)
    println(onlineCourse.reviews)
    println(onlineCourse.students)
}