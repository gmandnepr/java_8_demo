package lambda.lambda_reflexion;

public class MainThis {

    public static void main(String[] args) {

        Runnable[] runnables = {
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(this.getClass());
                    }
                }
//                ,() -> System.out.println(this.getClass()) No this, lambda is static inner like!
        };

        for (Runnable runnable : runnables) {
            runnable.run();
        }
    }
}
