package lambda.functional_interface;

@FunctionalInterface
public interface MyAnotherFunctionInterface {

    void doSomething();

    default void doSomethingAnother() {
        doSomething();
    }
}
