package com.grigor.picsart.service;

import com.grigor.picsart.model.Student;

public final class StudentService {

    private static final int CURRENT_YEAR = 2020;

    public static void printFullName(Student[] students) {
        System.out.println("Print students full name.");
        System.out.println("------------------------");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    public static void printMaleStudents(Student[] students) {
        System.out.println("------------------------");
        System.out.println("Print male students.");
        for (Student student : students) {
            if (student.isMale()) {
                System.out.println(student);
            }
        }
    }

    public static void printGreaterMarkFemaleStudents(Student[] students) {
        System.out.println("------------------------");
        System.out.println("Print all female students who has mark greater then 50.4");
        for (Student student : students) {
            if (!student.isMale() && student.getMark() > 50.4) {
                System.out.println(student);
            }
        }
    }

    public static void printMinimalMarkHavingStudent(Student[] students) {
        System.out.println("-------------------------------");
        System.out.println("Print student information having the minimal mark");
        double min = students[0].getMark();
        for (Student student : students) {
            if (min > student.getMark()) {
                min = student.getMark();
                System.out.print(student);
            }
        }
    }

    public static void printBiggestStudentInfo(Student[] students) {
        System.out.println("\n---------------------------");
        System.out.println("Print biggest male student information");
        int max = (CURRENT_YEAR - students[0].getYear());
        for (Student student : students) {
            if (max < (CURRENT_YEAR - student.getYear())) {
                max = (CURRENT_YEAR - student.getYear());
                System.out.print(student);
            }
        }
    }

    public static void printStudentsSortedByMark(Student[] students) {
        System.out.println("------------------------------------");
        System.out.println("Print students sorted by mark");
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j - 1].getMark() > students[j].getMark()) {
                    Student tmp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = tmp;
                }
            }
        }
        for (Student student : students) {
            System.out.print(student + " |");
        }
    }

    public static void printFemaleStudentsSortedByYear(Student[] students) {
        System.out.println("\n------------------------------------");
        System.out.println("Print female students sorted by year");
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if ((CURRENT_YEAR - students[j - 1].getYear()) > (CURRENT_YEAR - students[j].getYear())) {
                    Student tmp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = tmp;
                }
            }
        }
        for (Student student : students) {
            if (!student.isMale()) {
                System.out.print(student + " |");
            }
        }
    }
}
