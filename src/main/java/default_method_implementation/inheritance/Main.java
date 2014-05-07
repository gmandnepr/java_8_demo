package default_method_implementation.inheritance;

public class Main {

    public static void main(String[] args) {

        System.out.println("Parent:");
        new Parent().myMethod();

        System.out.println("Child:");
        new Child().myMethod();

        System.out.println("InterfaceA:");
        new InterfaceA(){

        }.myMethod();

        System.out.println("MethodCollisionA:");
        new MethodCollisionA().myMethod();

        System.out.println("MethodCollisionB:");
        new MethodCollisionB().myMethod();
    }
}
