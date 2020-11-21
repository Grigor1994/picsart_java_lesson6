package com.grigor.picsart.model;

public class Student {

    private final String firstName;
    private final String lastName;
    private final int year;
    private final boolean isMale;
    private final float mark;

    public Student(String firstName, String lastName, int year, boolean isMale, float mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.isMale = isMale;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public boolean isMale() {
        return isMale;
    }

    public float getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return firstName + "," + lastName + "," + +year + "," + (isMale ? "m" : "f") + "," + mark;
    }
}
