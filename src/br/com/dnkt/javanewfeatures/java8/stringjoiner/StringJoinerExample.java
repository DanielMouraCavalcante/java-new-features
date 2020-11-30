package br.com.dnkt.javanewfeatures.java8.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {

        StringJoiner stringJoiner =  new StringJoiner(",");
        stringJoiner.add("Pillars Of Eternaty");
        stringJoiner.add("GTA 5");
        stringJoiner.add("Gran Turismo");
        stringJoiner.add("Battlefield 5");
        stringJoiner.add("The Last of Us");

        System.out.println(stringJoiner);
    }
}
