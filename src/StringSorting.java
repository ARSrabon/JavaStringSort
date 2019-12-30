import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class StringSorting {

    public static void main(String[] args) {
        Random random = new Random();
        List<Person> people = new ArrayList<>();
        Map<String, Person> personMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int age = random.nextInt(20);
            String name = RandomStringUtils.randomAlphabetic(age);
            people.add(new Person(name.toUpperCase(), age));
        }

        List<Person> personList = people.stream().sorted(Comparator.comparingInt(Person::getNameLength).thenComparing(Person::getName)).collect(Collectors.toList());

        System.out.println(personList);
    }
}
