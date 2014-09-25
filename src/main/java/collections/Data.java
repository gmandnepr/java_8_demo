package collections;

import java.util.*;

public class Data {

    public static final List<Person> PERSONS = Collections.unmodifiableList(Arrays.asList(
            new Person("Person A", 32),
            new Person("Person B", 48),
            new Person("Person C", 18),
            new Person("Person D", 15),
            new Person("Person E", 19),
            new Person("Person F", 9),
            new Person("Person G", 13),
            new Person("Person H", 4),
            new Person("Person I", 22),
            new Person("Person J", 32),
            new Person("Person K", 32),
            new Person("Person L", 15),
            new Person("Person M", 12),
            new Person("Person N", 58)
    ));
}
