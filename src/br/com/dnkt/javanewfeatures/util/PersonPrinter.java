package br.com.dnkt.javanewfeatures.util;

import br.com.dnkt.javanewfeatures.model.Person;

public class PersonPrinter {

    public static void print(Person person) {
        System.out.println(person.getName() + " | " + person.getAge());
    }
}
