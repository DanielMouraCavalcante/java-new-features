package br.com.dnkt.javanewfeatures.model;

public class Rectangle {

    public Rectangle() {

    }
    public Rectangle(Double width, Double height) {
        System.out.println("Rectangle Constructor: width [" + width + "] | height[ " + height + "]");
    }

    public void drawRectangle(Double width, Double height) {
        System.out.println("Drawing Rectangle: width [" + width + "] | height[ " + height + "]");
    }
}
