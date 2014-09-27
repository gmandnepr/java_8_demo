package default_method_implementation.inheritance.from_class_and_interface_on_same_level;

public interface ParentB {

    default void whoAmI() {
        System.out.println("ParentC.whoAmI");
    }
}
