package collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Collection<Person> persons = Arrays.asList(
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
        );

        persons.forEach(System.out::println);

        Set<String> namesOfAdultPersons = persons.stream().
                filter(p -> p.getAge() > 18).
                map(Person::getName).
                collect(Collectors.toSet());

        System.out.println("Names of adult: " + namesOfAdultPersons);

        List<Integer> sortedAges = persons.stream().
                map(Person::getAge).
                sorted().
                collect(Collectors.toList());

        System.out.println("Sorted ages: "+ sortedAges);


        Optional<Person> theOldest = persons.stream().
                reduce((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()) >= 0 ? p1 : p2);
        System.out.println("The oldest: " + theOldest.get());


        Optional<Integer> theOldestAge = persons.stream().
                map(Person::getAge).
                reduce(Math::max);
        System.out.println("The oldest: " + theOldestAge.get());


        List<AgeGroup> ageGroups = persons.stream().
                map(Person::getAge).
                map(AgeGroup::new).
                collect(ArrayList::new, Main::reduce, Main::mergeResults)
                .stream().
                sorted((g1, g2) -> Integer.compare(g2.getCount(), g1.getCount())).
                collect(Collectors.toList());

        System.out.println("Age groups: " + ageGroups);

    }

    private static void reduce(List<AgeGroup> groups, AgeGroup group) {
        Optional<AgeGroup> found = groups.stream().filter(group::equals).findFirst();
        if (found.isPresent()) {
            found.get().incCount();
        } else {
            groups.add(group);
        }
    }

    private static void mergeResults(List<AgeGroup> groups1, List<AgeGroup> groups2) {
        groups2.forEach(group -> reduce(groups1, group));
    }

}
