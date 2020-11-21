package com.grigor.picsart;

import com.grigor.picsart.model.Student;
import com.grigor.picsart.service.StudentService;
import com.grigor.picsart.util.Converter;
import com.grigor.picsart.util.Reader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Reader reader = new Reader("students.txt");
        List<String> data = reader.readAllData();
        Student[] students = new Student[data.size()];

        for (int i = 0; i < data.size(); i++) {
            students[i] = Converter.convertToStudent(data.get(i));
        }
        StudentService.printFullName(students);
        StudentService.printMaleStudents(students);
        StudentService.printGreaterMarkFemaleStudents(students);
        StudentService.printMinimalMarkHavingStudent(students);
        StudentService.printBiggestStudentInfo(students);
        StudentService.printStudentsSortedByMark(students);
        StudentService.printFemaleStudentsSortedByYear(students);
    }
}
