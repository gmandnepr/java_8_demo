package lambda.type_inference;


import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Comparator<Double> comparator0 = (a, b) -> Double.compare(a, b);
        Comparator<Double> comparator1 = (Double a, Double b) -> Double.compare(a, b);
//        Comparator<Double> comparator2 = (double a, double b) -> Double.compare(a, b);Compilation error
    }
}
