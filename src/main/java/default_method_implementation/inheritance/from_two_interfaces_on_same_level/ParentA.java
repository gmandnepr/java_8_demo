package default_method_implementation.inheritance.from_two_interfaces_on_same_level;

public interface ParentA {

    default void whoAmI() {
        System.out.println("ParentA.whoAmI");
    }
}
