package br.com.dnkt.javanewfeatures.java8.optional;

public class Address {

    private String city;

    private String state;

    public Address(final String city, final String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }
}
