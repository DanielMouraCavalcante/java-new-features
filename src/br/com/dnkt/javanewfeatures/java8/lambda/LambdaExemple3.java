package br.com.dnkt.javanewfeatures.java8.lambda;

import br.com.dnkt.javanewfeatures.model.Person;

import java.util.ArrayList;
import java.util.List;

public class LambdaExemple3 {

    public static void main (String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Marta", 62));
        personList.add(new Person("Daniel", 37));
        personList.add(new Person("Carol", 36));
        personList.add(new Person("Jose", 79));

        personList.forEach( (p) -> System.out.println(p.getName() + " | " + p.getAge()) );

        personList.sort( (p1, p2) -> p1.getAge().compareTo(p2.getAge()) );

        System.out.println("\n************************************\n");

        personList.forEach( (p) -> System.out.println(p.getName() + " | " + p.getAge()) );

    }
}
