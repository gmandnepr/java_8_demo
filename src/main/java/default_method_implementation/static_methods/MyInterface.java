package default_method_implementation.static_methods;

public interface MyInterface {

    int computeSomething();

    int THE_ANSWER = 42;

    static MyInterface create() {
        return () -> THE_ANSWER;
    }
}
