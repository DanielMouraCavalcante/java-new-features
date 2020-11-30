package br.com.dnkt.javanewfeatures.java8.methodrefereces;

import br.com.dnkt.javanewfeatures.model.Figure2D;
import br.com.dnkt.javanewfeatures.model.Rectangle;

public class MethodReference3 {

    public static void main (String[] args) {
        Figure2D figure2D = Rectangle::new;
        figure2D.draw(20.0, 5.5);
    }
}
