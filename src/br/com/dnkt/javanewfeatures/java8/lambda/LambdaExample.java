package br.com.dnkt.javanewfeatures.java8.lambda;

public class LambdaExample {

    public static void main (String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running t1");
            }
        });

        //Lambda examble
        Thread t2 = new Thread(() -> System.out.println("Running t2"));
        t1.run();
        t2.run();
    }
}
