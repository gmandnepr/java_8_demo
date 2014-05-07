package lambda.method_reference;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        String java = "java";

        Function<Long, BigDecimal> toBigDecimalConverter = BigDecimal::valueOf;//Static method
        Function<String, BigDecimal> bigDecimalParser = BigDecimal::new;//Constructor
        Predicate<String> emptyStringPredicate = java::equalsIgnoreCase;//Instance method

        System.out.println(toBigDecimalConverter.apply(1L));
        System.out.println(bigDecimalParser.apply("1"));
        System.out.println(emptyStringPredicate.test("not java"));
        System.out.println(emptyStringPredicate.test("java"));
    }
}
