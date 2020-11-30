package br.com.dnkt.javanewfeatures.java8.methodrefereces;

import br.com.dnkt.javanewfeatures.util.PersonPrinter;
import br.com.dnkt.javanewfeatures.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MethodReference2 {

    public static void main (String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Marta", 62));
        personList.add(new Person("Daniel", 37));
        personList.add(new Person("Carol", 36));
        personList.add(new Person("Jose", 79));

        personList.forEach(PersonPrinter::print);
        personList.forEach(Person::print);
    }
}
