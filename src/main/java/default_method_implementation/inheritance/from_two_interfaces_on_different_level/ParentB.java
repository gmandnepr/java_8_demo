package default_method_implementation.inheritance.from_two_interfaces_on_different_level;

public interface ParentB extends ParentA {

    default void whoAmI() {
        System.out.println("ParentB.whoAmI");
    }
}
