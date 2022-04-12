package com.icloud.state.review

class OnlineCourse {

    val reviews: ArrayList<Review> = ArrayList()

    var state: State = Draft(this)

    var students = ArrayList<Student>()

    fun addStudent(student: Student) {
        this.state.addStudent(student)
    }

    fun addReview(review: Review, student: Student) {
        this.state.addReview(review, student)
    }

    fun changeState(state: State) {
        this.state = state
    }
}