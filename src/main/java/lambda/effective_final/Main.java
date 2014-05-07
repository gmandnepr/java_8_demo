package lambda.effective_final;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws Exception {

        final String value = "value";
        String variable = "variable";

        printComputed(() -> null);
        printComputed(() -> "String");
        printComputed(() -> value);
        printComputed(() -> variable);
        printComputed(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return variable;
            }
        });
    }

    private static void printComputed(Callable<String> computer) throws Exception {
        System.out.println(computer.call());
    }
}
