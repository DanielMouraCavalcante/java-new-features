package br.com.dnkt.javanewfeatures.util;

import br.com.dnkt.javanewfeatures.model.Product;

import java.util.Comparator;

public class ProductSort implements Comparator<Product> {

    @Override
    public int compare(final Product p1, final Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

}
