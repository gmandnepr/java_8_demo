package collections;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollections {

    public static void main(String[] args) {

        List<Person> persons = Data.PERSONS;

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
                map(JavaCollections::map).
                reduce(JavaCollections::reduce).get();

        List<AgeGroup> sortedAgeGroups = ageGroups.stream().
                sorted(/*(a,b) -> -Integer.compare(a.getCount(), b.getCount())*/).
                collect(Collectors.toList());

        System.out.println("Sorted age groups: " + sortedAgeGroups);


    }

    public static List<AgeGroup> map(Person person) {
        return Collections.singletonList(new AgeGroup(person.getAge()));
    }

    public static List<AgeGroup> reduce(List<AgeGroup> a, List<AgeGroup> b) {
        assert b.size() == 1;

        AgeGroup bb = b.get(0);
        List<AgeGroup> reduced = new ArrayList<>();
        reduced.addAll(a);

        Optional<AgeGroup> found = a.stream().filter((item) -> item.getAge() == bb.getAge()).findFirst();
        if (found.isPresent()) {
            found.get().incCount();
        } else {
            reduced.add(bb);
        }

        return reduced;
    }
}
