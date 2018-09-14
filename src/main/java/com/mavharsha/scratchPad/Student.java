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
}
