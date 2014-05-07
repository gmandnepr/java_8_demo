package lambda.lambda_reflexion;

public class MainGetClass {

    public static void main(String[] args) {

        String toCatch = "some value";

        whoAmI(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am anon inner");
            }
        });

        whoAmI(() -> System.out.println("I am lambda"));

        whoAmI(() -> System.out.println("I am catching lambda" + toCatch));

    }

    public static void whoAmI(Runnable r) {
        System.out.println(r.getClass());
    }
}
