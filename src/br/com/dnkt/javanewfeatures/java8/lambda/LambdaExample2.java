package br.com.dnkt.javanewfeatures.java8.lambda;

public class LambdaExample2 {

    public static void main (String[] args) {

        Gateway gateway1 = new Gateway() {
            @Override
            public void route() {
                System.out.println("Routing ...");
            }
        };


        Gateway gateway2 = () -> System.out.println("Routing Gateway 2 ...");

        Gateway gateway3 = () -> {
            System.out.println("Starting Routing Gateway 3 ...");
            System.out.println("Routing Gateway 3 ...");
            System.out.println("Finish Routing Gateway 3 ...");
        };

        gateway1.route();
        gateway2.route();
        gateway3.route();

    }
}
