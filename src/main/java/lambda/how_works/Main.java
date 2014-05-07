package lambda.how_works;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        double local = 10;

        Function<Double, Double> capturing = (a) -> Math.max(local, a);//invoke lambda factory
        Function<Double, Double> notCapturing = (a) -> Math.max(10, a);//invoke lambda factory
    }

    //

    class Lambda$1Invoker implements Function<Double, Double> {

        private final double local;

        Lambda$1Invoker(double local) {
            this.local = local;
        }

        @Override
        public Double apply(Double x) {
            return Math.max(local, x);
        }
    }

    static Double lambda$1(Double local, Double x) {
        return Math.max(local, x);
    }

    static Double lambda$2(Double x) {
        return Math.max(10, x);
    }
}
