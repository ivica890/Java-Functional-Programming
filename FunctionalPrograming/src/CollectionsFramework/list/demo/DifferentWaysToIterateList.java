package CollectionsFramework.list.demo;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToIterateList {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("C");
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        for (int i = 0; i< languages.size(); i++){
            System.out.println(languages.get(i));
        }

        System.out.println("=================================");

        for(String language : languages){
            System.out.println(language);
        }

        System.out.println("=================================");

        languages.stream()
                .forEach(i -> System.out.println(i));
    }
}
