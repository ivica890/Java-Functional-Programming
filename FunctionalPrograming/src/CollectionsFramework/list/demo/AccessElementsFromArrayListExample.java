package CollectionsFramework.list.demo;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("C");
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println(languages.size());
        System.out.println(languages.get(3));
        System.out.println(languages.isEmpty());
        languages.set(3,"C#");
        System.out.println(languages.get(3));
    }
}
