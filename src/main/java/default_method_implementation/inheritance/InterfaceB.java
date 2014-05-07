package default_method_implementation.inheritance;

public interface InterfaceB {

    default void myMethod() {
        System.out.println("InterfaceB.myMethod");
    }
}
