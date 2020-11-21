package com.grigor.picsart.util;

import com.grigor.picsart.model.Student;

public final class Converter {

    public static Student convertToStudent(String data) {
        String[] strings = data.split(",");
        String firstName = strings[0];
        String lastName = strings[1];
        int year = Integer.parseInt(strings[2]);
        boolean isMale = strings[3].equals("m");
        float mark = Float.parseFloat(strings[4]);

        return new Student(firstName, lastName, year, isMale, mark);
    }
}
