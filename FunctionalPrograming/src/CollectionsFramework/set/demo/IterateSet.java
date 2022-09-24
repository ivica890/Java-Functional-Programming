package CollectionsFramework.set.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class IterateSet {
    public static void main(String[] args) {
        Set<String> languages = new HashSet<>();
        languages.add("C");
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

       for (String language : languages){
           System.out.println(language);
       }

       languages.forEach(i -> System.out.println(i));

       languages.stream()
               .forEach((i) -> System.out.println(i));
    }
}
