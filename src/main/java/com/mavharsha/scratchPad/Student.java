package com.mavharsha.scratchPad;

import java.util.Objects;

@SimpleTestAnnotation(message = "Adding a message")
public class Student {
    private String gpa;

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(gpa, student.gpa);
    }

    @Override
    public int hashCode() {

        return Objects.hash(gpa);
    }
}
