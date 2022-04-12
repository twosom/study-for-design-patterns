package com.icloud.state.before;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {


    private State state = State.DRAFT;
    private List<Student> students = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void addReview(String review, Student student) {
        if (this.state == State.PUBLISHED) {
            this.reviews.add(review);
        } else if (this.state == State.PRIVATE && this.students.contains(student)) {
            this.reviews.add(review);
        } else {
            throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 작성할 수 없습니다.");
        }
    }

    public void addStudent(Student student) {
        if (this.state == State.DRAFT || this.state == State.PUBLISHED) {
            this.students.add(student);
        } else if (this.state == State.PRIVATE && availableTo(student)) {
            this.students.add(student);
        } else {
            throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.");
        }

        if (this.students.size() > 1) {
            this.state = State.PRIVATE;
        }
    }

    private boolean availableTo(Student student) {
        return student.isEnabledForPrivateClass(this);
    }

    public void changeState(State newStatus) {
        this.state = newStatus;
    }


    public enum State {
        DRAFT,
        PRIVATE,
        PUBLISHED,
    }
}
