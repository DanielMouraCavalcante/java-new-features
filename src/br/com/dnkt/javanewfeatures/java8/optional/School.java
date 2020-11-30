package br.com.dnkt.javanewfeatures.java8.optional;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
