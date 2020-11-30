package br.com.dnkt.javanewfeatures.java8.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        School school = new School();

        Student student1 = new Student("Joao", 15);
        student1.setAddress(Optional.of(new Address("Niteroi", "Rio de Janeiro")));

        Student student2 = new Student("Jose", 14);
        student2.setAddress(Optional.of(new Address("Curitiba", "Parana")));

        Student student3 = new Student("Renan", 16);
        //student3 no address

        Student student4 = new Student("Pedro", 16);
        student4.setAddress(Optional.of(new Address("Rio das Ostras", "Rio de Janeiro")));

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        school.getStudents().stream()
            .filter(student -> student.getAddress().isPresent())
            .forEach(student -> System.out.println(student.getName() + " | " + student.getAge() + " | " +
                student.getAddress().get().getCity() + " | " + student.getAddress().get().getState()));

    }

}
