package functionalProg.streams;


import java.util.List;

import static functionalProg.streams.Gender.*;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        people.stream()
                .map(person -> person.getName())
                .mapToInt(name -> name.length())
                //.collect(Collectors.toSet())
                .forEach(gender -> System.out.println(gender));

    }

}

enum Gender{
    MALE,FEMALE, PREFER_NOT_TO_SAY
}

class Person{
    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}
