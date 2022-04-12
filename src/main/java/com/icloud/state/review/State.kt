package com.icloud.state.review

typealias Review = String

interface State {

    fun addStudent(student: Student)

    fun addReview(review: Review, student: Student)

}

class Published(private var onlineCourse: OnlineCourse) : State {
    override fun addStudent(student: Student) {
        this.onlineCourse.students.add(student)
    }

    override fun addReview(review: Review, student: Student) {
        this.onlineCourse.reviews.add(review)
    }
}

class Draft(private var onlineCourse: OnlineCourse) : State {
    override fun addStudent(student: Student) {
        this.onlineCourse.students.add(student)
        if (this.onlineCourse.students.size > 1) {
            this.onlineCourse.changeState(Private(this.onlineCourse))
        }
    }

    override fun addReview(review: Review, student: Student) {
        throw UnsupportedOperationException("드래프트 상태에서는 리뷰를 남길 수 없습니다.")
    }
}

class Private(private var onlineCourse: OnlineCourse) : State {
    override fun addStudent(student: Student) {
        if (student.isAvailable(this.onlineCourse)) {
            this.onlineCourse.students.add(student)
        } else {
            throw UnsupportedOperationException("프라이빗 코스를 수강할 수 없습니다.")
        }
    }

    override fun addReview(review: Review, student: Student) {
        if (this.onlineCourse.students.contains(student)) {
            this.onlineCourse.reviews.add(review)
        } else {
            throw UnsupportedOperationException("프라이빗 코스는 수강하는 학생만 리뷰를 남길 수 있습니다.")
        }
    }
}