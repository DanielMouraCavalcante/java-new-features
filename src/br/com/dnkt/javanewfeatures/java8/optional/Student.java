package br.com.dnkt.javanewfeatures.java8.optional;

import br.com.dnkt.javanewfeatures.java8.optional.Address;

import java.util.Optional;

public class Student {

    private String name;
    private Integer age;
    private Optional<Address> address;

    public Student(final String name, final Integer age) {
        this.name = name;
        this.age = age;
        address = Optional.empty();
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

    public Optional<Address> getAddress() {
        return address;
    }

    public void setAddress(final Optional<Address> address) {
        this.address = address;
    }
}
