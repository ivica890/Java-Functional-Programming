package CollectionsFramework.linkedList.demo;

import java.util.LinkedList;

public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        languages.add("C");
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C++");
        languages.add("JavaScript");

        boolean result = languages.contains("C");
        System.out.println(result);

        int index = languages.indexOf("Java");
        System.out.println(index);

        int lastIndex = languages.lastIndexOf("C++");
        System.out.println(lastIndex);

        languages.forEach(i -> System.out.println(i));
    }
}
