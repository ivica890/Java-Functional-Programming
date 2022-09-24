package CollectionsFramework.linkedList.demo;

import java.util.LinkedList;
import java.util.List;

public class RemoveLinkedListElementExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Strawberry");
        System.out.println(fruits);

        String firstEleement = fruits.removeFirst();
        System.out.println(fruits);

        String lastElement = fruits.removeLast();
        System.out.println(fruits);

        fruits.remove("Apple");
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);
    }
}
