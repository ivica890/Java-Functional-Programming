package CollectionsFramework.set.demo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String[] args) {
        Set<String> languages = new HashSet<>();
        languages.add("C");
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        System.out.println(languages);

        languages.add("Java");
        System.out.println(languages);




    }
}
