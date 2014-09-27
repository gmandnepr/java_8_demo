package default_method_implementation.inheritance.from_class_and_interface_on_different_level;

public interface ParentC {

    default void whoAmI() {
        System.out.println("ParentC.whoAmI");
    }
}
