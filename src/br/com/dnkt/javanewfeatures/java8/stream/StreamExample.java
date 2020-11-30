package br.com.dnkt.javanewfeatures.java8.stream;

import br.com.dnkt.javanewfeatures.model.Product;
import br.com.dnkt.javanewfeatures.util.ProductSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(1, "Geladeira 470L", 2999.00));
        productList.add(new Product(2, "TV UHD 50''", 3500.00));
        productList.add(new Product(3, "TV UHD 65''", 5000.00));
        productList.add(new Product(4, "Microondas 20L", 399.00));
        productList.add(new Product(5, "Geladeira 120L", 900.00));
        productList.add(new Product(6, "Computador i5 2.9Ghz 4GB 1TB HD", 2429.00));
        productList.add(new Product(7, "Geladeira 500L", 3100.00));

        System.out.println("Antes de java 8 .. sem streams");

        //Cria lista só de geladeiras
        List<Product> listaGeladeiras = new ArrayList<Product>();
        for(Product p : productList) {
            if(p.getName().contains("Geladeira")) {
                listaGeladeiras.add(p);
            }
        }

        //Ordena a lista de geladeiras por preço crescente
        Collections.sort(listaGeladeiras, new ProductSort());

        //Cria a lista só de nomes em letras maiúsculas das geladeiras
        List<String> listaNomesGeladeiras = new ArrayList<String>();
        for(Product p : listaGeladeiras) {
            listaNomesGeladeiras.add(p.getName().toUpperCase());
        }

        for(String nome : listaNomesGeladeiras) {
            System.out.println(nome);
        }

        /*************************************************************/

        System.out.println("Java 8: Usando Java Streams...");
        //java 8: usando streams/pipeline
        productList.stream()
            .filter((p -> p.getName().contains("Geladeira")))
            .sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()))
            .map((p -> p.getName().toUpperCase()))
            .forEach(System.out::println);

    }
}
