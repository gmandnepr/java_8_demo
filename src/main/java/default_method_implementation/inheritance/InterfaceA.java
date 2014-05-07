package default_method_implementation.inheritance;

public interface InterfaceA {

    default void myMethod() {
        System.out.println("InterfaceA.myMethod");
    }
}
