package br.com.dnkt.javanewfeatures.java8.methodrefereces;

import br.com.dnkt.javanewfeatures.model.Figure2D;
import br.com.dnkt.javanewfeatures.model.Rectangle;

public class MethodReference1 {

    public static void main (String[] args) {

        Figure2D fig1 = (w, h) -> System.out.println("Drawing Rectangle: width [" + w + "] | height[ " + h + "]");
        fig1.draw(8.0, 1.5);

        Rectangle r = new Rectangle();

        Figure2D fig2 = r::drawRectangle;
        fig2.draw(15.0, 3.0);
    }
}
