package default_method_implementation.inheritance;

public class MethodCollisionA implements InterfaceA, InterfaceB {

    @Override
    public void myMethod() {
        InterfaceA.super.myMethod();
    }
}
