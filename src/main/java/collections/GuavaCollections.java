package collections;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GuavaCollections {

    public static void main(String[] args) {

        List<Person> persons = Data.PERSONS;

        Set<String> namesOfAdultPersonsByJava = persons.stream().
                filter(p -> p.getAge() > 18).
                map(Person::getName).
                collect(Collectors.toSet());
        System.out.println(namesOfAdultPersonsByJava);


        Set<String> namesOfAdultPersonsByGuava = FluentIterable.from(persons).
                filter(p -> p.getAge() > 18).
                transform(Person::getName).
                toSet();
        System.out.println(namesOfAdultPersonsByGuava);

        assert namesOfAdultPersonsByJava.equals(namesOfAdultPersonsByGuava);

        List<AgeGroup> ageGroups = ImmutableList.copyOf(persons).stream().
                map(JavaCollections::map).
                reduce(JavaCollections::reduce).get();

        FluentIterable.from(ageGroups).forEach(System.out::println);
    }
}
