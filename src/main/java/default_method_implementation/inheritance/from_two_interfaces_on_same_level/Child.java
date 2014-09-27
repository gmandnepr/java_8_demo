package default_method_implementation.inheritance.from_two_interfaces_on_same_level;

public class Child implements ParentA, ParentB {

    @Override
    public void whoAmI() {
        ParentB.super.whoAmI();
    }

    public static void main(String[] args) {
        new Child().whoAmI();
    }
}
