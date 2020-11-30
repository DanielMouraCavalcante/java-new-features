package br.com.dnkt.javanewfeatures.model;

public class Person {

    private String name;
    private Integer age;

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public static void print(Person person) {
        System.out.println(person.getName() + " | " + person.getAge());
    }

}
