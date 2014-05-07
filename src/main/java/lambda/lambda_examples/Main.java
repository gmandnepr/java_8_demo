package lambda.lambda_examples;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Runnable r0 = new Runnable() {
            @Override
            public void run() {
                System.out.println("No lambda :-(");
            }
        };

        Runnable r1 = () -> {
            System.out.println("Hello lambda!");
        };

        Runnable r2 = () -> System.out.println("Hello lambda!");

        /*--------------------*/

        Callable<String> c0 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "No lambda :-(";
            }
        };

        Callable<String> c1 = () -> {
            return "Hello lambda!";
        };

        Callable<String> c2 = () -> "Hello lambda!";

        /*--------------------*/



    }
}
