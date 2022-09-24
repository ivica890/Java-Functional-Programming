package functionalProg.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static functionalProg.imperative.Gender.*;

enum Gender{
    MALE,FEMALE
}

class Person{
    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE)
        );

        // imperative aproach
        System.out.println("Imperative");

        List<Person> females = new ArrayList<>();

        for(Person person : people){
           if(FEMALE.equals(person.getGender())){
               females.add(person);
           }
        }

        for (Person female : females){
            System.out.println(female);
        }

        // declarative aproach
        System.out.println("Declarative");
        List<Person> females1 = people.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .collect(Collectors.toList());

        females1.forEach(person -> System.out.println(person));

    }
}
