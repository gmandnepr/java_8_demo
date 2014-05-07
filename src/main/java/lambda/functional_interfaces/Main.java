package lambda.functional_interfaces;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Predicate<String> emptyPredicate = String::isEmpty;
        Function<Double, Double> doublingFunction = a -> a*2.0;
        BiFunction<Double, Double, Double> multiplyFunction = (a, b) -> a * b;
        BiFunction<Double, Double, Double> multiplyFunction2 = (Double a, Double b) -> a * b;
//        BiFunction<Double, Double, Double> multiplyFunction3 = (double a, double b) -> a * b;Compilation error

        Supplier<Double> random = Math::random;
        Consumer<Double> consumer = System.out::println;

        consumer.accept(random.get());
    }
}
